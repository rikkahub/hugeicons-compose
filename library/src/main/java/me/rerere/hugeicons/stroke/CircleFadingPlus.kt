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

val HugeIcons.CircleFadingPlus: ImageVector
    get() {
        if (_circleFadingPlus != null) {
            return _circleFadingPlus!!
        }
        _circleFadingPlus = ImageVector.Builder(
            name = "CircleFadingPlus",
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
            moveTo(18.5618f, 19.5496f)
            curveTo(17.4511f, 20.5162f, 16.1087f, 21.2512f, 14.5904f, 21.6576f)
            curveTo(13.7249f, 21.8893f, 12.8554f, 22f, 12f, 22f)
            moveTo(7.46257f, 20.906f)
            curveTo(6.30344f, 20.3145f, 5.26113f, 19.4992f, 4.40468f, 18.5f)
            moveTo(2.3439f, 14.5847f)
            curveTo(2.06477f, 13.5441f, 1.96053f, 12.4978f, 2.01316f, 11.4771f)
            moveTo(3.08975f, 7.46053f)
            curveTo(3.301f, 7.04586f, 3.54091f, 6.64615f, 3.80765f, 6.26456f)
            moveTo(7.53022f, 3.05251f)
            curveTo(8.12024f, 2.7588f, 8.74825f, 2.51942f, 9.40963f, 2.34238f)
            curveTo(14.7425f, 0.914877f, 20.2255f, 4.08152f, 21.6561f, 9.41528f)
            curveTo(22.2166f, 11.5051f, 22.0719f, 13.6176f, 21.3677f, 15.5f)
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
            moveTo(11.9991f, 8f)
            verticalLineTo(16f)
            moveTo(7.99414f, 11.995f)
            lineTo(15.9941f, 11.995f)
        }
        }.build()

        return _circleFadingPlus!!
    }

private var _circleFadingPlus: ImageVector? = null
