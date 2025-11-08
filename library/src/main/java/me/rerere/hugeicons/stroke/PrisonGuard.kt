package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PrisonGuard: ImageVector
    get() {
        if (_prisonGuard != null) {
            return _prisonGuard!!
        }
        _prisonGuard = ImageVector.Builder(
            name = "PrisonGuard",
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
        moveTo(18f, 8f)
        curveTo(16.3288f, 7.37209f, 14.2513f, 7f, 12f, 7f)
        curveTo(9.74872f, 7f, 7.67122f, 7.37209f, 6f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.96979f, 8f)
        lineTo(6.24031f, 6.58747f)
        curveTo(5.66151f, 5.46671f, 5.37211f, 4.90633f, 5.55437f, 4.41103f)
        curveTo(5.73664f, 3.91574f, 6.2975f, 3.73843f, 7.41922f, 3.38381f)
        lineTo(11.3899f, 2.12854f)
        curveTo(11.6609f, 2.04285f, 11.7965f, 2f, 11.9355f, 2f)
        curveTo(12.0746f, 2f, 12.2102f, 2.04285f, 12.4812f, 2.12854f)
        lineTo(16.7192f, 3.46833f)
        curveTo(17.7297f, 3.78776f, 18.2349f, 3.94748f, 18.4275f, 4.39586f)
        curveTo(18.6202f, 4.84425f, 18.4132f, 5.37861f, 17.9993f, 6.44734f)
        lineTo(17.3979f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8f)
        verticalLineTo(9.72517f)
        curveTo(7f, 11.5184f, 7.92149f, 13.1802f, 9.42752f, 14.1028f)
        lineTo(9.94202f, 14.418f)
        curveTo(11.2087f, 15.194f, 12.7913f, 15.194f, 14.058f, 14.418f)
        lineTo(14.5725f, 14.1028f)
        curveTo(16.0785f, 13.1802f, 17f, 11.5184f, 17f, 9.72517f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14f)
        lineTo(16f, 17f)
        moveTo(16f, 17f)
        lineTo(14.6312f, 18.1954f)
        curveTo(13.3773f, 19.2905f, 12.7504f, 19.838f, 12f, 19.838f)
        curveTo(11.2496f, 19.838f, 10.6227f, 19.2905f, 9.36884f, 18.1954f)
        lineTo(8f, 17f)
        moveTo(16f, 17f)
        lineTo(17.7341f, 17.578f)
        curveTo(18.7322f, 17.9107f, 19.2312f, 18.0771f, 19.6742f, 18.3342f)
        curveTo(20.1079f, 18.5859f, 20.5012f, 18.9014f, 20.841f, 19.2701f)
        curveTo(21.1881f, 19.6468f, 22f, 21f, 22f, 22f)
        moveTo(9f, 14f)
        lineTo(8f, 17f)
        moveTo(8f, 17f)
        lineTo(6.26586f, 17.578f)
        curveTo(5.2678f, 17.9107f, 4.76877f, 18.0771f, 4.32577f, 18.3342f)
        curveTo(3.89213f, 18.5859f, 3.49882f, 18.9014f, 3.15903f, 19.2701f)
        curveTo(2.81191f, 19.6468f, 2f, 21f, 2f, 22f)
        }
        }.build()

        return _prisonGuard!!
    }

private var _prisonGuard: ImageVector? = null
