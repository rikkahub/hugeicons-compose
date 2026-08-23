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

val HugeIcons.CirclePoundSterling: ImageVector
    get() {
        if (_circlePoundSterling != null) {
            return _circlePoundSterling!!
        }
        _circlePoundSterling = ImageVector.Builder(
            name = "CirclePoundSterling",
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
            moveTo(14.9909f, 9.73155f)
            curveTo(14.9479f, 9.14951f, 14.6199f, 7.7393f, 13.3593f, 7.21828f)
            curveTo(11.7836f, 6.56699f, 9.70875f, 7.38656f, 9.51462f, 9.4976f)
            curveTo(9.42353f, 10.4881f, 9.93434f, 11.5267f, 10.6766f, 12.0398f)
            curveTo(11.2647f, 12.4463f, 12.115f, 12.4845f, 12.9572f, 12.4874f)
            moveTo(12.9572f, 12.4874f)
            curveTo(13.0918f, 12.4878f, 13.2262f, 12.4874f, 13.3593f, 12.4874f)
            horizontalLineTo(12.9572f)
            close()
            moveTo(12.9572f, 12.4874f)
            horizontalLineTo(11.2374f)
            moveTo(11.2374f, 12.4874f)
            horizontalLineTo(8f)
            moveTo(11.2374f, 12.4874f)
            curveTo(11.1817f, 12.6997f, 10.9579f, 13.0342f, 10.6286f, 13.42f)
            curveTo(9.49106f, 14.7522f, 8.92231f, 15.4184f, 9.05637f, 15.709f)
            curveTo(9.19042f, 15.9997f, 9.98528f, 15.9995f, 11.575f, 15.9992f)
            lineTo(14.2516f, 15.9987f)
            curveTo(14.4753f, 15.9987f, 15.1064f, 16.0534f, 16f, 15.4513f)
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
            close()
        }
        }.build()

        return _circlePoundSterling!!
    }

private var _circlePoundSterling: ImageVector? = null
