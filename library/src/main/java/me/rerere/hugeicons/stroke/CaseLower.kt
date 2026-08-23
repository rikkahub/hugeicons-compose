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

val HugeIcons.CaseLower: ImageVector
    get() {
        if (_caseLower != null) {
            return _caseLower!!
        }
        _caseLower = ImageVector.Builder(
            name = "CaseLower",
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
            moveTo(6.5f, 17f)
            curveTo(8.433f, 17f, 10f, 15.433f, 10f, 13.5f)
            curveTo(10f, 11.567f, 8.433f, 10f, 6.5f, 10f)
            curveTo(4.567f, 10f, 3f, 11.567f, 3f, 13.5f)
            curveTo(3f, 15.433f, 4.567f, 17f, 6.5f, 17f)
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
            moveTo(17.5f, 17f)
            curveTo(19.433f, 17f, 21f, 15.433f, 21f, 13.5f)
            curveTo(21f, 11.567f, 19.433f, 10f, 17.5f, 10f)
            curveTo(15.567f, 10f, 14f, 11.567f, 14f, 13.5f)
            curveTo(14f, 15.433f, 15.567f, 17f, 17.5f, 17f)
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
            moveTo(10f, 10f)
            verticalLineTo(17f)
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
            moveTo(14f, 7f)
            verticalLineTo(17f)
        }
        }.build()

        return _caseLower!!
    }

private var _caseLower: ImageVector? = null
