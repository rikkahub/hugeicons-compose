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

val HugeIcons.SearchCheck: ImageVector
    get() {
        if (_searchCheck != null) {
            return _searchCheck!!
        }
        _searchCheck = ImageVector.Builder(
            name = "SearchCheck",
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
            moveTo(17.4922f, 17.5f)
            lineTo(21.9922f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.9922f, 11f)
            curveTo(19.9922f, 6.02944f, 15.9628f, 2f, 10.9922f, 2f)
            curveTo(6.02163f, 2f, 1.99219f, 6.02944f, 1.99219f, 11f)
            curveTo(1.99219f, 15.9706f, 6.02163f, 20f, 10.9922f, 20f)
            curveTo(15.9628f, 20f, 19.9922f, 15.9706f, 19.9922f, 11f)
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
            moveTo(7.49219f, 11.8333f)
            curveTo(7.49219f, 11.8333f, 8.36719f, 11.8333f, 9.24219f, 13.5f)
            curveTo(9.24219f, 13.5f, 12.0216f, 9.33333f, 14.4922f, 8.5f)
        }
        }.build()

        return _searchCheck!!
    }

private var _searchCheck: ImageVector? = null
