package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FaceId: ImageVector
    get() {
        if (_faceId != null) {
            return _faceId!!
        }
        _faceId = ImageVector.Builder(
            name = "FaceId",
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
        moveTo(2.5f, 8.18677f)
        curveTo(2.60406f, 6.08705f, 2.91537f, 4.77792f, 3.84664f, 3.84664f)
        curveTo(4.77792f, 2.91537f, 6.08705f, 2.60406f, 8.18677f, 2.5f)
        moveTo(21.5f, 8.18677f)
        curveTo(21.3959f, 6.08705f, 21.0846f, 4.77792f, 20.1534f, 3.84664f)
        curveTo(19.2221f, 2.91537f, 17.9129f, 2.60406f, 15.8132f, 2.5f)
        moveTo(15.8132f, 21.5f)
        curveTo(17.9129f, 21.3959f, 19.2221f, 21.0846f, 20.1534f, 20.1534f)
        curveTo(21.0846f, 19.2221f, 21.3959f, 17.9129f, 21.5f, 15.8132f)
        moveTo(8.18676f, 21.5f)
        curveTo(6.08705f, 21.3959f, 4.77792f, 21.0846f, 3.84664f, 20.1534f)
        curveTo(2.91537f, 19.2221f, 2.60406f, 17.9129f, 2.5f, 15.8132f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 17f)
        lineTo(17.2978f, 16.1511f)
        curveTo(17.1307f, 15.4497f, 16.5989f, 14.8925f, 15.9061f, 14.6929f)
        lineTo(13.5f, 13.9994f)
        lineTo(13.4997f, 12.5318f)
        curveTo(14.3964f, 11.9266f, 14.9997f, 10.7955f, 14.9997f, 9.5f)
        curveTo(14.9997f, 7.567f, 13.6565f, 6f, 11.9997f, 6f)
        curveTo(10.3428f, 6f, 8.99966f, 7.567f, 8.99966f, 9.5f)
        curveTo(8.99966f, 10.7955f, 9.60296f, 11.9266f, 10.4997f, 12.5318f)
        lineTo(10.5f, 13.9994f)
        lineTo(8.10885f, 14.6994f)
        curveTo(7.43747f, 14.896f, 6.91757f, 15.429f, 6.73787f, 16.1051f)
        lineTo(6.5f, 17f)
        }
        }.build()

        return _faceId!!
    }

private var _faceId: ImageVector? = null
