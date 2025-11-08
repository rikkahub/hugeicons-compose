package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BiometricDevice: ImageVector
    get() {
        if (_biometricDevice != null) {
            return _biometricDevice!!
        }
        _biometricDevice = ImageVector.Builder(
            name = "BiometricDevice",
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
        moveTo(5f, 9f)
        curveTo(5f, 5.70017f, 5f, 4.05025f, 6.02513f, 3.02513f)
        curveTo(7.05025f, 2f, 8.70017f, 2f, 12f, 2f)
        curveTo(15.2998f, 2f, 16.9497f, 2f, 17.9749f, 3.02513f)
        curveTo(19f, 4.05025f, 19f, 5.70017f, 19f, 9f)
        verticalLineTo(15f)
        curveTo(19f, 18.2998f, 19f, 19.9497f, 17.9749f, 20.9749f)
        curveTo(16.9497f, 22f, 15.2998f, 22f, 12f, 22f)
        curveTo(8.70017f, 22f, 7.05025f, 22f, 6.02513f, 20.9749f)
        curveTo(5f, 19.9497f, 5f, 18.2998f, 5f, 15f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 13f)
        verticalLineTo(10.5f)
        curveTo(16f, 8.29086f, 14.2091f, 6.5f, 12f, 6.5f)
        curveTo(9.79086f, 6.5f, 8f, 8.29086f, 8f, 10.5f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 11f)
        verticalLineTo(10.5f)
        curveTo(13.5f, 9.67157f, 12.8284f, 9f, 12f, 9f)
        curveTo(11.1716f, 9f, 10.5f, 9.67157f, 10.5f, 10.5f)
        verticalLineTo(14f)
        moveTo(13.5f, 13.5f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        verticalLineTo(19.01f)
        }
        }.build()

        return _biometricDevice!!
    }

private var _biometricDevice: ImageVector? = null
