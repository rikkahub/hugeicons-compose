package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dead: ImageVector
    get() {
        if (_dead != null) {
            return _dead!!
        }
        _dead = ImageVector.Builder(
            name = "Dead",
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
        moveTo(9f, 16f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        lineTo(8.5f, 9.5f)
        moveTo(8.5f, 9.5f)
        lineTo(7f, 8f)
        moveTo(8.5f, 9.5f)
        lineTo(7f, 11f)
        moveTo(8.5f, 9.5f)
        lineTo(10f, 8f)
        moveTo(17f, 11f)
        lineTo(15.5f, 9.5f)
        moveTo(15.5f, 9.5f)
        lineTo(14f, 8f)
        moveTo(15.5f, 9.5f)
        lineTo(14f, 11f)
        moveTo(15.5f, 9.5f)
        lineTo(17f, 8f)
        }
        }.build()

        return _dead!!
    }

private var _dead: ImageVector? = null
