package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sujood: ImageVector
    get() {
        if (_sujood != null) {
            return _sujood!!
        }
        _sujood = ImageVector.Builder(
            name = "Sujood",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 12.5107f)
        curveTo(20f, 11.0269f, 19.1112f, 8.56411f, 15.5561f, 6.5857f)
        curveTo(11.1122f, 4.11268f, 7.81475f, 4.86323f, 6.66835f, 6.5857f)
        curveTo(5.6808f, 8.06949f, 5.18705f, 10.0479f, 9.63094f, 14.9939f)
        horizontalLineTo(7.99878f)
        curveTo(7.05716f, 14.9939f, 6.58499f, 14.9953f, 6.29222f, 15.2875f)
        curveTo(6f, 15.5802f, 6f, 16.0511f, 6f, 16.9927f)
        curveTo(6f, 17.9343f, 6f, 18.4051f, 6.29222f, 18.6979f)
        curveTo(6.58499f, 18.9901f, 7.05716f, 18.9915f, 7.99878f, 18.9915f)
        horizontalLineTo(10f)
        curveTo(11.165f, 19.069f, 13.4951f, 18.6512f, 13.4951f, 16.3595f)
        moveTo(20f, 12.5107f)
        curveTo(19.5f, 12.8337f, 18f, 14.382f, 16f, 13.9945f)
        lineTo(17f, 16.493f)
        curveTo(17.6667f, 16.6596f, 19.1f, 17.7922f, 19.5f, 18.9915f)
        horizontalLineTo(16.1606f)
        curveTo(15.4429f, 18.9915f, 14.7802f, 18.6071f, 14.4242f, 17.9844f)
        lineTo(13.4951f, 16.3595f)
        moveTo(20f, 12.5107f)
        horizontalLineTo(20.2577f)
        curveTo(21.7722f, 12.5107f, 23f, 13.7378f, 23f, 15.2514f)
        curveTo(23f, 16.765f, 21.7722f, 17.9921f, 20.2577f, 17.9921f)
        horizontalLineTo(19f)
        moveTo(15.5561f, 10.4966f)
        curveTo(14.7099f, 10.4966f, 13.6934f, 10.7926f, 12.8021f, 11.1429f)
        curveTo(11.7757f, 11.5463f, 11.443f, 12.7705f, 11.9902f, 13.7275f)
        lineTo(13.4951f, 16.3595f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.0001f, 15.5f)
        curveTo(4.99881f, 15.5f, 3.79726f, 14f, 2.99623f, 14f)
        curveTo(2.16898f, 14f, 2.02519f, 14.3413f, 2.00019f, 16.9976f)
        curveTo(1.9898f, 18.1021f, 2.394f, 19f, 3.5f, 19f)
        }
        }.build()

        return _sujood!!
    }

private var _sujood: ImageVector? = null
