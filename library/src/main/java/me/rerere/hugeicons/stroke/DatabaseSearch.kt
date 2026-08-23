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

val HugeIcons.DatabaseSearch: ImageVector
    get() {
        if (_databaseSearch != null) {
            return _databaseSearch!!
        }
        _databaseSearch = ImageVector.Builder(
            name = "DatabaseSearch",
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
            moveTo(22f, 21f)
            lineTo(20.125f, 19.125f)
            moveTo(21f, 17f)
            curveTo(21f, 18.6569f, 19.6569f, 20f, 18f, 20f)
            curveTo(16.3431f, 20f, 15f, 18.6569f, 15f, 17f)
            curveTo(15f, 15.3431f, 16.3431f, 14f, 18f, 14f)
            curveTo(19.6569f, 14f, 21f, 15.3431f, 21f, 17f)
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
            moveTo(20f, 5f)
            arcTo(8f, 3f, 0f, true, false, 4f, 5f)
            arcTo(8f, 3f, 0f, true, false, 20f, 5f)
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
            moveTo(4f, 12f)
            curveTo(4f, 13.5299f, 7.05369f, 14.7923f, 11f, 14.9768f)
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
            moveTo(12f, 22f)
            curveTo(7.58172f, 22f, 4f, 20.6569f, 4f, 19f)
            verticalLineTo(5f)
            moveTo(20f, 5f)
            verticalLineTo(10f)
        }
        }.build()

        return _databaseSearch!!
    }

private var _databaseSearch: ImageVector? = null
