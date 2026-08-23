package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
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
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 11f)
            verticalLineTo(9f)
            curveTo(15f, 7.34315f, 13.6569f, 6f, 12f, 6f)
            curveTo(10.3431f, 6f, 9f, 7.34315f, 9f, 9f)
            verticalLineTo(11f)
            curveTo(9f, 12.6569f, 10.3431f, 14f, 12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 9f)
            verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.125f, 19f)
            horizontalLineTo(12f)
            moveTo(12.25f, 19f)
            curveTo(12.25f, 19.1381f, 12.1381f, 19.25f, 12f, 19.25f)
            curveTo(11.8619f, 19.25f, 11.75f, 19.1381f, 11.75f, 19f)
            curveTo(11.75f, 18.8619f, 11.8619f, 18.75f, 12f, 18.75f)
            curveTo(12.1381f, 18.75f, 12.25f, 18.8619f, 12.25f, 19f)
            close()
        }
        }.build()

        return _biometricDevice!!
    }

private var _biometricDevice: ImageVector? = null
