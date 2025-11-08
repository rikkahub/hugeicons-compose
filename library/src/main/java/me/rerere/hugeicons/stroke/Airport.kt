package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Airport: ImageVector
    get() {
        if (_airport != null) {
            return _airport!!
        }
        _airport = ImageVector.Builder(
            name = "Airport",
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
        moveTo(10.0002f, 12f)
        horizontalLineTo(6.00024f)
        verticalLineTo(19f)
        curveTo(6.00024f, 20.4142f, 6.00024f, 21.1213f, 6.43958f, 21.5607f)
        curveTo(6.87892f, 22f, 7.58603f, 22f, 9.00024f, 22f)
        horizontalLineTo(10.0002f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.0002f, 15f)
        horizontalLineTo(10.0002f)
        verticalLineTo(22f)
        horizontalLineTo(18.0002f)
        curveTo(19.4145f, 22f, 20.1216f, 22f, 20.5609f, 21.5607f)
        curveTo(21.0002f, 21.1213f, 21.0002f, 20.4142f, 21.0002f, 19f)
        verticalLineTo(18f)
        curveTo(21.0002f, 16.5858f, 21.0002f, 15.8787f, 20.5609f, 15.4393f)
        curveTo(20.1216f, 15f, 19.4145f, 15f, 18.0002f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 6f)
        lineTo(20f, 7f)
        moveTo(16.5f, 7f)
        horizontalLineTo(20f)
        moveTo(20f, 7f)
        lineTo(17f, 10f)
        horizontalLineTo(16f)
        moveTo(20f, 7f)
        verticalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.2686f, 10.1181f)
        curveTo(11.9025f, 11.0296f, 11.7195f, 11.4854f, 11.3388f, 11.7427f)
        curveTo(10.9582f, 12f, 10.4671f, 12f, 9.4848f, 12f)
        horizontalLineTo(6.51178f)
        curveTo(5.5295f, 12f, 5.03836f, 12f, 4.65773f, 11.7427f)
        curveTo(4.27711f, 11.4854f, 4.09405f, 11.0296f, 3.72794f, 10.1181f)
        lineTo(3.57717f, 9.74278f)
        curveTo(3.07804f, 8.50009f, 2.82847f, 7.87874f, 3.12717f, 7.43937f)
        curveTo(3.42587f, 7f, 4.09785f, 7f, 5.44182f, 7f)
        horizontalLineTo(10.5548f)
        curveTo(11.8987f, 7f, 12.5707f, 7f, 12.8694f, 7.43937f)
        curveTo(13.1681f, 7.87874f, 12.9185f, 8.50009f, 12.4194f, 9.74278f)
        lineTo(12.2686f, 10.1181f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.99616f, 7f)
        horizontalLineTo(6.00407f)
        curveTo(5.18904f, 5.73219f, 4.8491f, 5.09829f, 5.06258f, 4.59641f)
        curveTo(5.34685f, 4.13381f, 6.15056f, 4f, 7.61989f, 4f)
        horizontalLineTo(8.38063f)
        curveTo(9.84995f, 4f, 10.6537f, 4.13381f, 10.9379f, 4.59641f)
        curveTo(11.1514f, 5.09829f, 10.8112f, 5.73219f, 9.99616f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 4f)
        verticalLineTo(2f)
        }
        }.build()

        return _airport!!
    }

private var _airport: ImageVector? = null
