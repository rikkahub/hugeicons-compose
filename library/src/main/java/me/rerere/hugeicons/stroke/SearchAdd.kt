package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SearchAdd: ImageVector
    get() {
        if (_searchAdd != null) {
            return _searchAdd!!
        }
        _searchAdd = ImageVector.Builder(
            name = "SearchAdd",
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
        moveTo(7.5f, 11f)
        lineTo(14.5f, 11f)
        moveTo(11f, 7.5f)
        verticalLineTo(14.5f)
        }
        }.build()

        return _searchAdd!!
    }

private var _searchAdd: ImageVector? = null
