package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SearchFocus: ImageVector
    get() {
        if (_searchFocus != null) {
            return _searchFocus!!
        }
        _searchFocus = ImageVector.Builder(
            name = "SearchFocus",
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
        moveTo(17f, 17f)
        lineTo(21f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11f)
        curveTo(19f, 6.58172f, 15.4183f, 3f, 11f, 3f)
        curveTo(6.58172f, 3f, 3f, 6.58172f, 3f, 11f)
        curveTo(3f, 15.4183f, 6.58172f, 19f, 11f, 19f)
        curveTo(15.4183f, 19f, 19f, 15.4183f, 19f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.4924f, 7.5f)
        curveTo(8.77591f, 7.54342f, 8.31993f, 7.66286f, 7.99139f, 7.99139f)
        curveTo(7.66286f, 8.31993f, 7.54342f, 8.77591f, 7.5f, 9.4924f)
        moveTo(12.5076f, 7.5f)
        curveTo(13.2241f, 7.54342f, 13.6801f, 7.66286f, 14.0086f, 7.99139f)
        curveTo(14.3371f, 8.31993f, 14.4566f, 8.77591f, 14.5f, 9.4924f)
        moveTo(14.4923f, 12.6214f)
        curveTo(14.4431f, 13.273f, 14.3194f, 13.6978f, 14.0086f, 14.0086f)
        curveTo(13.6801f, 14.3371f, 13.2241f, 14.4566f, 12.5076f, 14.5f)
        moveTo(9.4924f, 14.5f)
        curveTo(8.7759f, 14.4566f, 8.31993f, 14.3371f, 7.99139f, 14.0086f)
        curveTo(7.6806f, 13.6978f, 7.55693f, 13.273f, 7.50772f, 12.6214f)
        }
        }.build()

        return _searchFocus!!
    }

private var _searchFocus: ImageVector? = null
