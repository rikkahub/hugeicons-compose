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

val HugeIcons.LampWallUp: ImageVector
    get() {
        if (_lampWallUp != null) {
            return _lampWallUp!!
        }
        _lampWallUp = ImageVector.Builder(
            name = "LampWallUp",
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
            moveTo(9f, 7f)
            horizontalLineTo(19f)
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
            moveTo(8.65943f, 12f)
            horizontalLineTo(19.3406f)
            curveTo(20.2571f, 12f, 21f, 11.2571f, 21f, 10.3406f)
            curveTo(21f, 10.1159f, 20.9544f, 9.89349f, 20.8659f, 9.68694f)
            lineTo(19.039f, 5.42433f)
            curveTo(18.5351f, 4.24853f, 18.2832f, 3.66064f, 17.7822f, 3.33032f)
            curveTo(17.2813f, 3f, 16.6417f, 3f, 15.3624f, 3f)
            horizontalLineTo(12.6376f)
            curveTo(11.3584f, 3f, 10.7188f, 3f, 10.2178f, 3.33032f)
            curveTo(9.7169f, 3.66064f, 9.46495f, 4.24853f, 8.96104f, 5.42432f)
            lineTo(7.1342f, 9.68694f)
            curveTo(7.04568f, 9.89349f, 7.00003f, 10.1159f, 7.00003f, 10.3406f)
            curveTo(7.00003f, 11.2571f, 7.74297f, 12f, 8.65943f, 12f)
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
            moveTo(3.00003f, 19.6667f)
            verticalLineTo(16.3333f)
            curveTo(3.00003f, 16.0233f, 3.00003f, 15.8683f, 3.0341f, 15.7412f)
            curveTo(3.12657f, 15.3961f, 3.39612f, 15.1265f, 3.74121f, 15.0341f)
            curveTo(3.86838f, 15f, 4.02337f, 15f, 4.33336f, 15f)
            curveTo(4.95334f, 15f, 5.26334f, 15f, 5.51767f, 15.0681f)
            curveTo(6.20785f, 15.2531f, 6.74695f, 15.7922f, 6.93188f, 16.4824f)
            curveTo(7.00003f, 16.7367f, 7.00003f, 17.0467f, 7.00003f, 17.6667f)
            verticalLineTo(18.3333f)
            curveTo(7.00003f, 18.9533f, 7.00003f, 19.2633f, 6.93188f, 19.5176f)
            curveTo(6.74695f, 20.2078f, 6.20785f, 20.7469f, 5.51767f, 20.9319f)
            curveTo(5.26334f, 21f, 4.95334f, 21f, 4.33336f, 21f)
            curveTo(4.02337f, 21f, 3.86838f, 21f, 3.74121f, 20.9659f)
            curveTo(3.39612f, 20.8735f, 3.12657f, 20.6039f, 3.0341f, 20.2588f)
            curveTo(3.00003f, 20.1317f, 3.00003f, 19.9767f, 3.00003f, 19.6667f)
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
            moveTo(7.00003f, 18f)
            horizontalLineTo(8.00003f)
            curveTo(10.8285f, 18f, 12.2427f, 18f, 13.1214f, 17.1213f)
            curveTo(14f, 16.2426f, 14f, 14.8284f, 14f, 12f)
        }
        }.build()

        return _lampWallUp!!
    }

private var _lampWallUp: ImageVector? = null
