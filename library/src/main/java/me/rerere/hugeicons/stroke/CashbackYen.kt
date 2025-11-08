package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CashbackYen: ImageVector
    get() {
        if (_cashbackYen != null) {
            return _cashbackYen!!
        }
        _cashbackYen = ImageVector.Builder(
            name = "CashbackYen",
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
        moveTo(2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(7.89936f, 2f, 4.3752f, 4.46819f, 2.83209f, 8f)
        moveTo(2f, 4.5f)
        lineTo(2.5f, 8.5f)
        lineTo(6.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 7.5f)
        lineTo(12f, 11f)
        moveTo(12f, 11f)
        lineTo(15f, 7.5f)
        moveTo(12f, 11f)
        verticalLineTo(16.5f)
        moveTo(14.5f, 13f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _cashbackYen!!
    }

private var _cashbackYen: ImageVector? = null
