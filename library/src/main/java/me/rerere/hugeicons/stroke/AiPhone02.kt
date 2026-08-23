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

val HugeIcons.AiPhone02: ImageVector
    get() {
        if (_aiPhone02 != null) {
            return _aiPhone02!!
        }
        _aiPhone02 = ImageVector.Builder(
            name = "AiPhone02",
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
            moveTo(19f, 15f)
            lineTo(19f, 9f)
            curveTo(19f, 5.70018f, 19f, 4.05025f, 17.9749f, 3.02513f)
            curveTo(16.9498f, 2f, 15.2998f, 2f, 12f, 2f)
            curveTo(8.70017f, 2f, 7.05025f, 2f, 6.02513f, 3.02513f)
            curveTo(5f, 4.05025f, 5f, 5.70017f, 5f, 9f)
            verticalLineTo(15f)
            curveTo(5f, 18.2998f, 5f, 19.9497f, 6.02513f, 20.9749f)
            curveTo(7.05025f, 22f, 8.70017f, 22f, 12f, 22f)
            curveTo(15.2998f, 22f, 16.9497f, 22f, 17.9749f, 20.9749f)
            curveTo(19f, 19.9497f, 19f, 18.2998f, 19f, 15f)
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
            moveTo(11.9737f, 7.02148f)
            curveTo(11.9795f, 6.99284f, 12.0205f, 6.99284f, 12.0263f, 7.02148f)
            curveTo(12.3302f, 8.50808f, 13.4919f, 9.66984f, 14.9785f, 9.97368f)
            curveTo(15.0072f, 9.97954f, 15.0072f, 10.0205f, 14.9785f, 10.0263f)
            curveTo(13.4919f, 10.3302f, 12.3302f, 11.4919f, 12.0263f, 12.9785f)
            curveTo(12.0205f, 13.0072f, 11.9795f, 13.0072f, 11.9737f, 12.9785f)
            curveTo(11.6698f, 11.4919f, 10.5081f, 10.3302f, 9.02148f, 10.0263f)
            curveTo(8.99284f, 10.0205f, 8.99284f, 9.97954f, 9.02148f, 9.97368f)
            curveTo(10.5081f, 9.66984f, 11.6698f, 8.50808f, 11.9737f, 7.02148f)
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
            moveTo(12.125f, 18.75f)
            horizontalLineTo(12f)
            moveTo(12.25f, 18.75f)
            curveTo(12.25f, 18.8881f, 12.1381f, 19f, 12f, 19f)
            curveTo(11.8619f, 19f, 11.75f, 18.8881f, 11.75f, 18.75f)
            curveTo(11.75f, 18.6119f, 11.8619f, 18.5f, 12f, 18.5f)
            curveTo(12.1381f, 18.5f, 12.25f, 18.6119f, 12.25f, 18.75f)
            close()
        }
        }.build()

        return _aiPhone02!!
    }

private var _aiPhone02: ImageVector? = null
