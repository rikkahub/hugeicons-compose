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

val HugeIcons.Utensils: ImageVector
    get() {
        if (_utensils != null) {
            return _utensils!!
        }
        _utensils = ImageVector.Builder(
            name = "Utensils",
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
            moveTo(7f, 11.5f)
            verticalLineTo(21f)
            moveTo(4f, 3f)
            verticalLineTo(8f)
            curveTo(4f, 8.93188f, 4f, 9.39782f, 4.15224f, 9.76537f)
            curveTo(4.35523f, 10.2554f, 4.74458f, 10.6448f, 5.23463f, 10.8478f)
            curveTo(5.60218f, 11f, 6.06812f, 11f, 7f, 11f)
            curveTo(7.93188f, 11f, 8.39782f, 11f, 8.76537f, 10.8478f)
            curveTo(9.25542f, 10.6448f, 9.64477f, 10.2554f, 9.84776f, 9.76537f)
            curveTo(10f, 9.39782f, 10f, 8.93188f, 10f, 8f)
            verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7f, 8f)
            verticalLineTo(3f)
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
            moveTo(16f, 21f)
            verticalLineTo(14f)
            moveTo(16f, 14f)
            verticalLineTo(3f)
            curveTo(18.2091f, 3f, 20f, 4.79086f, 20f, 7f)
            verticalLineTo(10.3333f)
            curveTo(20f, 11.8971f, 20f, 12.6789f, 19.5867f, 13.2175f)
            curveTo(19.4803f, 13.3562f, 19.3562f, 13.4803f, 19.2175f, 13.5867f)
            curveTo(18.6789f, 14f, 17.8971f, 14f, 16.3333f, 14f)
            horizontalLineTo(16f)
            close()
        }
        }.build()

        return _utensils!!
    }

private var _utensils: ImageVector? = null
