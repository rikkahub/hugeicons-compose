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

val HugeIcons.UnfoldLess: ImageVector
    get() {
        if (_unfoldLess != null) {
            return _unfoldLess!!
        }
        _unfoldLess = ImageVector.Builder(
            name = "UnfoldLess",
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
            moveTo(18f, 19f)
            curveTo(18f, 19f, 13.5811f, 14f, 12f, 14f)
            curveTo(10.4188f, 14f, 6f, 19f, 6f, 19f)
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
            moveTo(18f, 5.00004f)
            curveTo(18f, 5.00004f, 13.5811f, 9.99999f, 12f, 10f)
            curveTo(10.4188f, 10f, 6f, 5f, 6f, 5f)
        }
        }.build()

        return _unfoldLess!!
    }

private var _unfoldLess: ImageVector? = null
