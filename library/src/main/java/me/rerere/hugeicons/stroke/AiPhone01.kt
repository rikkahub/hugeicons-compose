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

val HugeIcons.AiPhone01: ImageVector
    get() {
        if (_aiPhone01 != null) {
            return _aiPhone01!!
        }
        _aiPhone01 = ImageVector.Builder(
            name = "AiPhone01",
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
            moveTo(18f, 11.5f)
            verticalLineTo(15f)
            curveTo(18f, 18.2998f, 18f, 19.9497f, 16.9749f, 20.9749f)
            curveTo(15.9497f, 22f, 14.2998f, 22f, 11f, 22f)
            curveTo(7.70017f, 22f, 6.05025f, 22f, 5.02513f, 20.9749f)
            curveTo(4f, 19.9497f, 4f, 18.2998f, 4f, 15f)
            verticalLineTo(9f)
            curveTo(4f, 5.70017f, 4f, 4.05025f, 5.02513f, 3.02513f)
            curveTo(6.05025f, 2f, 7.70017f, 2f, 11f, 2f)
            curveTo(11.7473f, 2f, 11.41f, 2f, 12f, 2.01191f)
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
            moveTo(11.125f, 18.75f)
            horizontalLineTo(11f)
            moveTo(11.25f, 18.75f)
            curveTo(11.25f, 18.8881f, 11.1381f, 19f, 11f, 19f)
            curveTo(10.8619f, 19f, 10.75f, 18.8881f, 10.75f, 18.75f)
            curveTo(10.75f, 18.6119f, 10.8619f, 18.5f, 11f, 18.5f)
            curveTo(11.1381f, 18.5f, 11.25f, 18.6119f, 11.25f, 18.75f)
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
            moveTo(16.9737f, 2.02148f)
            curveTo(16.9795f, 1.99284f, 17.0205f, 1.99284f, 17.0263f, 2.02148f)
            curveTo(17.3302f, 3.50808f, 18.4919f, 4.66984f, 19.9785f, 4.97368f)
            curveTo(20.0072f, 4.97954f, 20.0072f, 5.02046f, 19.9785f, 5.02632f)
            curveTo(18.4919f, 5.33016f, 17.3302f, 6.49192f, 17.0263f, 7.97852f)
            curveTo(17.0205f, 8.00716f, 16.9795f, 8.00716f, 16.9737f, 7.97852f)
            curveTo(16.6698f, 6.49192f, 15.5081f, 5.33016f, 14.0215f, 5.02632f)
            curveTo(13.9928f, 5.02046f, 13.9928f, 4.97954f, 14.0215f, 4.97368f)
            curveTo(15.5081f, 4.66984f, 16.6698f, 3.50808f, 16.9737f, 2.02148f)
            close()
        }
        }.build()

        return _aiPhone01!!
    }

private var _aiPhone01: ImageVector? = null
