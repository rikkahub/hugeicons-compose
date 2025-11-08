package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Seal: ImageVector
    get() {
        if (_seal != null) {
            return _seal!!
        }
        _seal = ImageVector.Builder(
            name = "Seal",
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
        moveTo(9.77907f, 3.35212f)
        curveTo(10.3428f, 2.74898f, 10.6246f, 2.44741f, 10.9257f, 2.27941f)
        curveTo(11.5935f, 1.90686f, 12.4065f, 1.90686f, 13.0743f, 2.27941f)
        curveTo(13.3754f, 2.44741f, 13.6572f, 2.74898f, 14.2209f, 3.35212f)
        curveTo(14.8996f, 4.07828f, 15.5834f, 4.34707f, 16.5445f, 4.31459f)
        curveTo(17.3696f, 4.2867f, 17.7822f, 4.27276f, 18.1139f, 4.36689f)
        curveTo(18.8495f, 4.57561f, 19.4244f, 5.15054f, 19.6331f, 5.88612f)
        curveTo(19.7272f, 6.21784f, 19.7133f, 6.63038f, 19.6854f, 7.45546f)
        curveTo(19.6518f, 8.44883f, 19.9453f, 9.12242f, 20.6479f, 9.77907f)
        curveTo(21.251f, 10.3428f, 21.5526f, 10.6246f, 21.7206f, 10.9257f)
        curveTo(22.0931f, 11.5935f, 22.0931f, 12.4065f, 21.7206f, 13.0743f)
        curveTo(21.5526f, 13.3754f, 21.251f, 13.6572f, 20.6479f, 14.2209f)
        curveTo(19.9217f, 14.8996f, 19.6529f, 15.5834f, 19.6854f, 16.5445f)
        curveTo(19.7133f, 17.3696f, 19.7272f, 17.7822f, 19.6331f, 18.1139f)
        curveTo(19.4244f, 18.8495f, 18.8495f, 19.4244f, 18.1139f, 19.6331f)
        curveTo(17.7822f, 19.7272f, 17.3696f, 19.7133f, 16.5445f, 19.6854f)
        curveTo(15.5834f, 19.6529f, 14.8996f, 19.9217f, 14.2209f, 20.6479f)
        curveTo(13.6572f, 21.251f, 13.3754f, 21.5526f, 13.0743f, 21.7206f)
        curveTo(12.4065f, 22.0931f, 11.5935f, 22.0931f, 10.9257f, 21.7206f)
        curveTo(10.6246f, 21.5526f, 10.3428f, 21.251f, 9.77907f, 20.6479f)
        curveTo(9.12242f, 19.9453f, 8.44883f, 19.6518f, 7.45546f, 19.6854f)
        curveTo(6.63038f, 19.7133f, 6.21784f, 19.7272f, 5.88612f, 19.6331f)
        curveTo(5.15054f, 19.4244f, 4.57561f, 18.8495f, 4.36689f, 18.1139f)
        curveTo(4.27276f, 17.7822f, 4.2867f, 17.3696f, 4.31459f, 16.5445f)
        curveTo(4.34707f, 15.5834f, 4.07828f, 14.8996f, 3.35212f, 14.2209f)
        curveTo(2.74898f, 13.6572f, 2.44741f, 13.3754f, 2.27941f, 13.0743f)
        curveTo(1.90686f, 12.4065f, 1.90686f, 11.5935f, 2.27941f, 10.9257f)
        curveTo(2.44741f, 10.6246f, 2.74898f, 10.3428f, 3.35212f, 9.77907f)
        curveTo(4.07828f, 9.10038f, 4.34707f, 8.41658f, 4.31459f, 7.45546f)
        curveTo(4.2867f, 6.63038f, 4.27276f, 6.21784f, 4.36689f, 5.88612f)
        curveTo(4.57561f, 5.15054f, 5.15054f, 4.57561f, 5.88612f, 4.36689f)
        curveTo(7.32838f, 3.95764f, 8.57898f, 4.63615f, 9.77907f, 3.35212f)
        }
        }.build()

        return _seal!!
    }

private var _seal: ImageVector? = null
