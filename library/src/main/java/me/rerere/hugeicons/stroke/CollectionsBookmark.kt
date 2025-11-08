package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CollectionsBookmark: ImageVector
    get() {
        if (_collectionsBookmark != null) {
            return _collectionsBookmark!!
        }
        _collectionsBookmark = ImageVector.Builder(
            name = "CollectionsBookmark",
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
        moveTo(16.9017f, 6.12874f)
        curveTo(18f, 7.25748f, 18f, 9.07416f, 18f, 12.7075f)
        verticalLineTo(14.2925f)
        curveTo(18f, 17.9258f, 18f, 19.7425f, 16.9017f, 20.8713f)
        curveTo(15.8033f, 22f, 14.0355f, 22f, 10.5f, 22f)
        curveTo(6.96447f, 22f, 5.1967f, 22f, 4.09835f, 20.8713f)
        curveTo(3f, 19.7425f, 3f, 17.9258f, 3f, 14.2925f)
        verticalLineTo(12.7075f)
        curveTo(3f, 9.07416f, 3f, 7.25748f, 4.09835f, 6.12874f)
        curveTo(5.1967f, 5f, 6.96447f, 5f, 10.5f, 5f)
        curveTo(14.0355f, 5f, 15.8033f, 5f, 16.9017f, 6.12874f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 5.5f)
        verticalLineTo(10.3693f)
        curveTo(7.5f, 11.3046f, 7.5f, 11.7722f, 7.78982f, 11.9396f)
        curveTo(8.35105f, 12.2638f, 9.4038f, 11.1823f, 9.90375f, 10.8567f)
        curveTo(10.1937f, 10.6678f, 10.3387f, 10.5734f, 10.5f, 10.5734f)
        curveTo(10.6613f, 10.5734f, 10.8063f, 10.6678f, 11.0962f, 10.8567f)
        curveTo(11.5962f, 11.1823f, 12.6489f, 12.2638f, 13.2102f, 11.9396f)
        curveTo(13.5f, 11.7722f, 13.5f, 11.3046f, 13.5f, 10.3693f)
        verticalLineTo(5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 2f)
        horizontalLineTo(11f)
        curveTo(15.714f, 2f, 18.0711f, 2f, 19.5355f, 3.46447f)
        curveTo(21f, 4.92893f, 21f, 7.28595f, 21f, 12f)
        verticalLineTo(18f)
        }
        }.build()

        return _collectionsBookmark!!
    }

private var _collectionsBookmark: ImageVector? = null
