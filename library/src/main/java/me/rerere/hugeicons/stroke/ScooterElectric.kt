package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScooterElectric: ImageVector
    get() {
        if (_scooterElectric != null) {
            return _scooterElectric!!
        }
        _scooterElectric = ImageVector.Builder(
            name = "ScooterElectric",
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
        moveTo(6.51383f, 18f)
        horizontalLineTo(13.2887f)
        curveTo(14.0213f, 18f, 14.3876f, 18f, 14.6328f, 17.8445f)
        curveTo(14.878f, 17.689f, 15.0854f, 17.2491f, 15.5002f, 16.3693f)
        curveTo(15.735f, 15.8712f, 16.0361f, 15.411f, 16.3921f, 15f)
        moveTo(16.3921f, 15f)
        lineTo(4f, 16f)
        moveTo(16.3921f, 15f)
        curveTo(17.0623f, 14.2264f, 17.9273f, 13.6269f, 18.913f, 13.2759f)
        curveTo(19.4501f, 13.0846f, 19.7186f, 12.9889f, 19.8093f, 12.8143f)
        curveTo(19.8999f, 12.6397f, 19.8331f, 12.3991f, 19.6995f, 11.918f)
        lineTo(18.1691f, 6.4088f)
        curveTo(17.9184f, 5.50632f, 17.7931f, 5.05508f, 17.5225f, 4.72715f)
        curveTo(17.3256f, 4.4885f, 17.076f, 4.29879f, 16.7934f, 4.17293f)
        curveTo(16.405f, 4f, 15.9366f, 4f, 15f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.4626f, 7f)
        lineTo(10.0686f, 8.81238f)
        curveTo(9.91919f, 9.0066f, 10.0263f, 9.28605f, 10.2699f, 9.33776f)
        lineTo(11.7301f, 9.64772f)
        curveTo(11.9899f, 9.70285f, 12.0889f, 10.0122f, 11.9073f, 10.2011f)
        lineTo(10.1777f, 12f)
        }
        }.build()

        return _scooterElectric!!
    }

private var _scooterElectric: ImageVector? = null
