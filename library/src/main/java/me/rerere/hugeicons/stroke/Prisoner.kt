package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Prisoner: ImageVector
    get() {
        if (_prisoner != null) {
            return _prisoner!!
        }
        _prisoner = ImageVector.Builder(
            name = "Prisoner",
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
        moveTo(18f, 7f)
        curveTo(16.3288f, 6.37209f, 14.2513f, 6f, 12f, 6f)
        curveTo(9.74872f, 6f, 7.67122f, 6.37209f, 6f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        verticalLineTo(8.72517f)
        curveTo(7f, 10.5184f, 7.92149f, 12.1802f, 9.42752f, 13.1028f)
        lineTo(9.94202f, 13.418f)
        curveTo(11.2087f, 14.194f, 12.7913f, 14.194f, 14.058f, 13.418f)
        lineTo(14.5725f, 13.1028f)
        curveTo(16.0785f, 12.1802f, 17f, 10.5184f, 17f, 8.72517f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8f)
        verticalLineTo(5.95612f)
        curveTo(7f, 4.61118f, 7.92149f, 3.36487f, 9.42752f, 2.6729f)
        lineTo(9.94202f, 2.43651f)
        curveTo(11.2087f, 1.8545f, 12.7913f, 1.8545f, 14.058f, 2.43651f)
        lineTo(14.5725f, 2.6729f)
        curveTo(16.0785f, 3.36487f, 17f, 4.61118f, 17f, 5.95612f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 13f)
        lineTo(16f, 16f)
        moveTo(16f, 16f)
        lineTo(14.6312f, 17.1954f)
        curveTo(13.3773f, 18.2905f, 12.7504f, 18.838f, 12f, 18.838f)
        curveTo(11.2496f, 18.838f, 10.6227f, 18.2905f, 9.36884f, 17.1954f)
        lineTo(8f, 16f)
        moveTo(16f, 16f)
        lineTo(17.7341f, 16.578f)
        curveTo(18.7322f, 16.9107f, 19.2312f, 17.0771f, 19.6742f, 17.3342f)
        curveTo(20.1079f, 17.5859f, 20.5012f, 17.9014f, 20.841f, 18.2701f)
        curveTo(21.1881f, 18.6468f, 22f, 20f, 22f, 22f)
        moveTo(9f, 13f)
        lineTo(8f, 16f)
        moveTo(8f, 16f)
        lineTo(6.26586f, 16.578f)
        curveTo(5.2678f, 16.9107f, 4.76877f, 17.0771f, 4.32577f, 17.3342f)
        curveTo(3.89213f, 17.5859f, 3.49882f, 17.9014f, 3.15903f, 18.2701f)
        curveTo(2.81191f, 18.6468f, 2f, 20f, 2f, 22f)
        }
        }.build()

        return _prisoner!!
    }

private var _prisoner: ImageVector? = null
