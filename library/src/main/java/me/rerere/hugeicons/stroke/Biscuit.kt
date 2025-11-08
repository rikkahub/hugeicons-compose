package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Biscuit: ImageVector
    get() {
        if (_biscuit != null) {
            return _biscuit!!
        }
        _biscuit = ImageVector.Builder(
            name = "Biscuit",
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
        moveTo(14.0078f, 11f)
        lineTo(13.9988f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00781f, 16f)
        lineTo(7.99883f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.24887f, 9.30307f)
        curveTo(5.79205f, 10.3381f, 5.98187f, 11.4892f, 6.67285f, 11.8741f)
        curveTo(7.36383f, 12.259f, 8.29431f, 11.7319f, 8.75113f, 10.6969f)
        curveTo(9.20795f, 9.66191f, 9.01813f, 8.51084f, 8.32715f, 8.12594f)
        curveTo(7.63617f, 7.74103f, 6.70569f, 8.26805f, 6.24887f, 9.30307f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.1766f, 15.8719f)
        curveTo(12.787f, 16.624f, 13.0636f, 17.5149f, 13.7945f, 17.8618f)
        curveTo(14.5254f, 18.2087f, 15.4338f, 17.8802f, 15.8234f, 17.1281f)
        curveTo(16.213f, 16.376f, 15.9364f, 15.4851f, 15.2055f, 15.1382f)
        curveTo(14.4746f, 14.7913f, 13.5662f, 15.1198f, 13.1766f, 15.8719f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(12.2417f, 2f, 12.3874f, 2.26355f, 12.2959f, 2.48729f)
        curveTo(12.1052f, 2.95395f, 12f, 3.4647f, 12f, 4f)
        curveTo(12f, 6.20914f, 13.7909f, 8f, 16f, 8f)
        curveTo(16.5478f, 8f, 17.0699f, 7.88988f, 17.5453f, 7.69056f)
        curveTo(17.7487f, 7.60533f, 18f, 7.77954f, 18f, 8f)
        curveTo(18f, 9.65685f, 19.3431f, 11f, 21f, 11f)
        curveTo(21.1138f, 11f, 21.2261f, 10.9937f, 21.3365f, 10.9813f)
        curveTo(21.6512f, 10.9462f, 21.9691f, 11.1463f, 21.9858f, 11.4625f)
        curveTo(21.9952f, 11.6405f, 22f, 11.8197f, 22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        }
        }.build()

        return _biscuit!!
    }

private var _biscuit: ImageVector? = null
