package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AtomicPower: ImageVector
    get() {
        if (_atomicPower != null) {
            return _atomicPower!!
        }
        _atomicPower = ImageVector.Builder(
            name = "AtomicPower",
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
        moveTo(20.663f, 8.85f)
        curveTo(21.2522f, 6.81022f, 21.0868f, 5.03955f, 20.0236f, 3.97636f)
        curveTo(17.7744f, 1.7271f, 12.3587f, 3.49602f, 7.92736f, 7.92736f)
        curveTo(7.45397f, 8.40074f, 7.01097f, 8.88536f, 6.6f, 9.37615f)
        moveTo(17.4f, 14.6238f)
        curveTo(16.989f, 15.1146f, 16.546f, 15.5993f, 16.0726f, 16.0726f)
        curveTo(11.6413f, 20.504f, 6.22562f, 22.2729f, 3.97636f, 20.0236f)
        curveTo(2.83569f, 18.883f, 2.72842f, 16.928f, 3.47772f, 14.7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6754f, 9.30005f)
        lineTo(10.9243f, 11.3704f)
        curveTo(10.7105f, 11.6476f, 10.6037f, 11.7862f, 10.6699f, 11.8931f)
        curveTo(10.7361f, 12f, 10.9288f, 12f, 11.3141f, 12f)
        horizontalLineTo(12.6867f)
        curveTo(13.072f, 12f, 13.2647f, 12f, 13.3309f, 12.107f)
        curveTo(13.3971f, 12.2139f, 13.2902f, 12.3525f, 13.0765f, 12.6297f)
        lineTo(11.3141f, 14.7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.75f, 17.7059f)
        curveTo(9.13145f, 17.2114f, 8.52058f, 16.6659f, 7.92736f, 16.0726f)
        curveTo(3.49602f, 11.6413f, 1.7271f, 6.22562f, 3.97636f, 3.97636f)
        curveTo(5.11702f, 2.83569f, 7.07202f, 2.72842f, 9.3f, 3.47772f)
        moveTo(14.25f, 20.3607f)
        curveTo(16.6631f, 21.2813f, 18.8068f, 21.2405f, 20.0236f, 20.0236f)
        curveTo(22.2729f, 17.7744f, 20.504f, 12.3587f, 16.0726f, 7.92736f)
        curveTo(15.4794f, 7.33413f, 14.8686f, 6.78862f, 14.25f, 6.29407f)
        }
        }.build()

        return _atomicPower!!
    }

private var _atomicPower: ImageVector? = null
