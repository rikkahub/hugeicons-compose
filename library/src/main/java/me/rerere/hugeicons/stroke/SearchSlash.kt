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

val HugeIcons.SearchSlash: ImageVector
    get() {
        if (_searchSlash != null) {
            return _searchSlash!!
        }
        _searchSlash = ImageVector.Builder(
            name = "SearchSlash",
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
            moveTo(16.9922f, 17f)
            lineTo(20.9922f, 21f)
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
            moveTo(18.9922f, 11f)
            curveTo(18.9922f, 6.58172f, 15.4105f, 3f, 10.9922f, 3f)
            curveTo(6.57391f, 3f, 2.99219f, 6.58172f, 2.99219f, 11f)
            curveTo(2.99219f, 15.4183f, 6.57391f, 19f, 10.9922f, 19f)
            curveTo(15.4105f, 19f, 18.9922f, 15.4183f, 18.9922f, 11f)
            close()
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
            moveTo(13.9922f, 8f)
            lineTo(10.9922f, 11f)
            lineTo(7.99219f, 14f)
        }
        }.build()

        return _searchSlash!!
    }

private var _searchSlash: ImageVector? = null
