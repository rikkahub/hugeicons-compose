package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Telephone: ImageVector
    get() {
        if (_telephone != null) {
            return _telephone!!
        }
        _telephone = ImageVector.Builder(
            name = "Telephone",
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
        moveTo(4.74038f, 14.3685f)
        lineTo(6.69351f, 12.9816f)
        curveTo(7.24445f, 12.5904f, 7.80305f, 12.3282f, 8.44034f, 12.1585f)
        curveTo(9.17201f, 11.9636f, 9.5f, 11.5644f, 9.5f, 10.711f)
        curveTo(9.5f, 8.54628f, 14.5f, 8.31594f, 14.5f, 10.711f)
        curveTo(14.5f, 11.5644f, 14.828f, 11.9636f, 15.5597f, 12.1585f)
        curveTo(16.202f, 12.3295f, 16.7599f, 12.5934f, 17.3065f, 12.9816f)
        lineTo(19.2596f, 14.3685f)
        curveTo(20.1434f, 14.9961f, 20.5547f, 15.2995f, 20.7842f, 15.7819f)
        curveTo(21f, 16.2358f, 21f, 16.768f, 21f, 17.8324f)
        curveTo(21f, 19.7461f, 21f, 20.703f, 20.4642f, 21.3164f)
        curveTo(19.8152f, 22.0593f, 18.128f, 21.9955f, 17.0917f, 21.9955f)
        horizontalLineTo(6.90833f)
        curveTo(5.87197f, 21.9955f, 4.21909f, 22.0986f, 3.5358f, 21.3164f)
        curveTo(3f, 20.703f, 3f, 19.7461f, 3f, 17.8324f)
        curveTo(3f, 16.768f, 3f, 16.2358f, 3.21584f, 15.7819f)
        curveTo(3.44526f, 15.2995f, 3.85662f, 14.9961f, 4.74038f, 14.3685f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17f)
        curveTo(14f, 18.1046f, 13.1046f, 19f, 12f, 19f)
        curveTo(10.8954f, 19f, 10f, 18.1046f, 10f, 17f)
        curveTo(10f, 15.8954f, 10.8954f, 15f, 12f, 15f)
        curveTo(13.1046f, 15f, 14f, 15.8954f, 14f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.96014f, 3.69772f)
        curveTo(5.6417f, 4.07415f, 4.69384f, 4.54112f, 3.82645f, 5.10455f)
        curveTo(2.45318f, 5.9966f, 1.86443f, 7.60404f, 2.02607f, 9.15513f)
        curveTo(2.09439f, 9.81068f, 2.62064f, 10.1241f, 3.23089f, 9.95455f)
        curveTo(3.69451f, 9.82571f, 4.15888f, 9.7003f, 4.61961f, 9.56364f)
        curveTo(5.96706f, 9.16397f, 6.28399f, 8.67812f, 6.47124f, 7.29885f)
        lineTo(6.96014f, 3.69772f)
        moveTo(6.96014f, 3.69772f)
        curveTo(10.2186f, 2.76743f, 13.7814f, 2.76743f, 17.0399f, 3.69772f)
        moveTo(17.0399f, 3.69772f)
        curveTo(18.3583f, 4.07415f, 19.3062f, 4.54112f, 20.1735f, 5.10455f)
        curveTo(21.5468f, 5.9966f, 22.1356f, 7.60404f, 21.9739f, 9.15513f)
        curveTo(21.9056f, 9.81068f, 21.3794f, 10.1241f, 20.7691f, 9.95455f)
        curveTo(20.3055f, 9.82571f, 19.8411f, 9.7003f, 19.3804f, 9.56364f)
        curveTo(18.0329f, 9.16397f, 17.716f, 8.67812f, 17.5288f, 7.29885f)
        lineTo(17.0399f, 3.69772f)
        }
        }.build()

        return _telephone!!
    }

private var _telephone: ImageVector? = null
