package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Klarna: ImageVector
    get() {
        if (_klarna != null) {
            return _klarna!!
        }
        _klarna = ImageVector.Builder(
            name = "Klarna",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 3.5f)
        horizontalLineTo(11.1985f)
        curveTo(11.1985f, 9.8463f, 6f, 12.5f, 6f, 12.5f)
        lineTo(11.8931f, 20.5f)
        horizontalLineTo(16.5f)
        lineTo(11f, 13f)
        curveTo(11f, 13f, 15f, 10f, 15f, 3.5f)
        }
        }.build()

        return _klarna!!
    }

private var _klarna: ImageVector? = null
