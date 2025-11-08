package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CashbackEuro: ImageVector
    get() {
        if (_cashbackEuro != null) {
            return _cashbackEuro!!
        }
        _cashbackEuro = ImageVector.Builder(
            name = "CashbackEuro",
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
        moveTo(16f, 8.25777f)
        curveTo(15.285f, 7.77914f, 14.4251f, 7.5f, 13.5f, 7.5f)
        curveTo(11.0147f, 7.5f, 9f, 9.51472f, 9f, 12f)
        curveTo(9f, 14.4853f, 11.0147f, 16.5f, 13.5f, 16.5f)
        curveTo(14.4251f, 16.5f, 15.285f, 16.2209f, 16f, 15.7422f)
        moveTo(7.5f, 10.5f)
        horizontalLineTo(12.5f)
        moveTo(12.5f, 13.5f)
        horizontalLineTo(7.5f)
        }
        }.build()

        return _cashbackEuro!!
    }

private var _cashbackEuro: ImageVector? = null
