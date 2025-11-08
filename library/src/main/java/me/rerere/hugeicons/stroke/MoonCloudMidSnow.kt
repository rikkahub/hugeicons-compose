package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoonCloudMidSnow: ImageVector
    get() {
        if (_moonCloudMidSnow != null) {
            return _moonCloudMidSnow!!
        }
        _moonCloudMidSnow = ImageVector.Builder(
            name = "MoonCloudMidSnow",
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
        moveTo(12f, 16f)
        verticalLineTo(22f)
        moveTo(14.5f, 17.5f)
        lineTo(9.50013f, 20.5f)
        moveTo(9.5f, 17.5f)
        lineTo(14.4999f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4776f, 11.0451f)
        curveTo(17.485f, 11.0451f, 17.4925f, 11.0451f, 17.5f, 11.0451f)
        curveTo(19.9853f, 11.0451f, 22f, 13.0749f, 22f, 15.5788f)
        curveTo(22f, 17.7364f, 20.504f, 19.542f, 18.5f, 20.0001f)
        moveTo(17.4776f, 11.0451f)
        curveTo(17.4924f, 10.8792f, 17.5f, 10.7111f, 17.5f, 10.5413f)
        curveTo(17.5f, 7.481f, 15.0376f, 5.00012f, 12f, 5.00012f)
        curveTo(9.12324f, 5.00012f, 6.76233f, 7.22528f, 6.52042f, 10.0604f)
        moveTo(17.4776f, 11.0451f)
        curveTo(17.395f, 11.9687f, 16.9769f, 12.7633f, 16.5f, 13.5001f)
        moveTo(6.52042f, 10.0604f)
        curveTo(3.98398f, 10.3036f, 2f, 12.4559f, 2f, 15.075f)
        curveTo(2f, 17.3306f, 3.47145f, 19.2399f, 5.5f, 19.8818f)
        moveTo(6.52042f, 10.0604f)
        curveTo(6.67826f, 10.0453f, 6.83823f, 10.0376f, 7f, 10.0376f)
        curveTo(8.12582f, 10.0376f, 9.16474f, 10.4124f, 10.0005f, 11.0451f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 5.13829f)
        curveTo(9.91652f, 4.70849f, 9.76249f, 4.28506f, 9.53351f, 3.88456f)
        curveTo(8.98606f, 2.92704f, 8.11203f, 2.27864f, 7.13552f, 2f)
        curveTo(7.28642f, 3.22635f, 6.71543f, 4.48154f, 5.58897f, 5.13829f)
        curveTo(4.46251f, 5.79504f, 3.10057f, 5.66681f, 2.1243f, 4.92166f)
        curveTo(1.87501f, 5.91497f, 1.99406f, 7.00354f, 2.54151f, 7.96107f)
        curveTo(3.48512f, 9.61151f, 5.39904f, 10.3436f, 7.13552f, 9.84664f)
        }
        }.build()

        return _moonCloudMidSnow!!
    }

private var _moonCloudMidSnow: ImageVector? = null
