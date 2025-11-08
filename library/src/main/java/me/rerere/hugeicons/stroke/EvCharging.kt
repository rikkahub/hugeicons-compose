package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EvCharging: ImageVector
    get() {
        if (_evCharging != null) {
            return _evCharging!!
        }
        _evCharging = ImageVector.Builder(
            name = "EvCharging",
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
        moveTo(3f, 22f)
        verticalLineTo(7f)
        curveTo(3f, 4.64298f, 3f, 3.46447f, 3.73223f, 2.73223f)
        curveTo(4.46447f, 2f, 5.64298f, 2f, 8f, 2f)
        horizontalLineTo(11f)
        curveTo(13.357f, 2f, 14.5355f, 2f, 15.2678f, 2.73223f)
        curveTo(16f, 3.46447f, 16f, 4.64298f, 16f, 7f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 11f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 8.52662f)
        lineTo(21.4472f, 8.30539f)
        curveTo(21.7162f, 8.17234f, 21.8507f, 8.10582f, 21.9253f, 7.98628f)
        curveTo(22f, 7.86674f, 22f, 7.71799f, 22f, 7.42048f)
        verticalLineTo(6.72636f)
        curveTo(22f, 6.0826f, 22f, 5.76071f, 21.8255f, 5.61265f)
        curveTo(21.7702f, 5.5658f, 21.7053f, 5.53144f, 21.6353f, 5.51197f)
        curveTo(21.414f, 5.45041f, 21.1433f, 5.62896f, 20.6018f, 5.98606f)
        curveTo(19.9072f, 6.44425f, 19.5598f, 6.67335f, 19.3385f, 7.0001f)
        curveTo(19.265f, 7.10863f, 19.2025f, 7.2241f, 19.152f, 7.34482f)
        curveTo(19f, 7.70824f, 19f, 8.12125f, 19f, 8.94727f)
        verticalLineTo(10.5797f)
        curveTo(19f, 10.8118f, 19.1902f, 11f, 19.4248f, 11f)
        curveTo(19.7722f, 11f, 20.0846f, 10.7907f, 20.2136f, 10.4716f)
        lineTo(21f, 8.52662f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.4778f, 11f)
        curveTo(19.6789f, 12.3863f, 20.1452f, 13.9698f, 19.9555f, 15.3799f)
        curveTo(19.7838f, 16.657f, 18.7725f, 17.6876f, 17.4425f, 17.9412f)
        curveTo(17.1343f, 18f, 16.7562f, 18f, 16f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.25f, 14f)
        lineTo(8.30434f, 15.917f)
        curveTo(8.06684f, 16.1736f, 7.94808f, 16.3019f, 8.02165f, 16.401f)
        curveTo(8.09522f, 16.5f, 8.30931f, 16.5f, 8.73747f, 16.5f)
        horizontalLineTo(10.2625f)
        curveTo(10.6907f, 16.5f, 10.9048f, 16.5f, 10.9783f, 16.599f)
        curveTo(11.0519f, 16.6981f, 10.9332f, 16.8264f, 10.6957f, 17.083f)
        lineTo(8.73747f, 19f)
        }
        }.build()

        return _evCharging!!
    }

private var _evCharging: ImageVector? = null
