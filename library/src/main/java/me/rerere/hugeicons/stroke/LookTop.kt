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

val HugeIcons.LookTop: ImageVector
    get() {
        if (_lookTop != null) {
            return _lookTop!!
        }
        _lookTop = ImageVector.Builder(
            name = "LookTop",
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
            moveTo(2f, 12f)
            curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
            curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
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
            moveTo(9.5f, 12f)
            curveTo(10.2235f, 12.6334f, 11.0809f, 13f, 12f, 13f)
            curveTo(12.9191f, 13f, 13.7765f, 12.6334f, 14.5f, 12f)
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
            moveTo(15.625f, 6.887f)
            verticalLineTo(7.41649f)
            moveTo(8.375f, 6.887f)
            verticalLineTo(7.41649f)
            moveTo(8.75f, 7.25f)
            curveTo(8.75f, 6.83579f, 8.58211f, 6.5f, 8.375f, 6.5f)
            curveTo(8.16789f, 6.5f, 8f, 6.83579f, 8f, 7.25f)
            curveTo(8f, 7.66421f, 8.16789f, 8f, 8.375f, 8f)
            curveTo(8.58211f, 8f, 8.75f, 7.66421f, 8.75f, 7.25f)
            close()
            moveTo(16f, 7.25f)
            curveTo(16f, 6.83579f, 15.8321f, 6.5f, 15.625f, 6.5f)
            curveTo(15.4179f, 6.5f, 15.25f, 6.83579f, 15.25f, 7.25f)
            curveTo(15.25f, 7.66421f, 15.4179f, 8f, 15.625f, 8f)
            curveTo(15.8321f, 8f, 16f, 7.66421f, 16f, 7.25f)
            close()
        }
        }.build()

        return _lookTop!!
    }

private var _lookTop: ImageVector? = null
