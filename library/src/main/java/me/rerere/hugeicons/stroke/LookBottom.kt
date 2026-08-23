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

val HugeIcons.LookBottom: ImageVector
    get() {
        if (_lookBottom != null) {
            return _lookBottom!!
        }
        _lookBottom = ImageVector.Builder(
            name = "LookBottom",
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
            moveTo(9.5f, 17f)
            curveTo(10.2235f, 17.6334f, 11.0809f, 18f, 12f, 18f)
            curveTo(12.9191f, 18f, 13.7765f, 17.6334f, 14.5f, 17f)
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
            moveTo(15.625f, 11.887f)
            verticalLineTo(12.4165f)
            moveTo(8.375f, 11.887f)
            verticalLineTo(12.4165f)
            moveTo(8.75f, 12.25f)
            curveTo(8.75f, 11.8358f, 8.58211f, 11.5f, 8.375f, 11.5f)
            curveTo(8.16789f, 11.5f, 8f, 11.8358f, 8f, 12.25f)
            curveTo(8f, 12.6642f, 8.16789f, 13f, 8.375f, 13f)
            curveTo(8.58211f, 13f, 8.75f, 12.6642f, 8.75f, 12.25f)
            close()
            moveTo(16f, 12.25f)
            curveTo(16f, 11.8358f, 15.8321f, 11.5f, 15.625f, 11.5f)
            curveTo(15.4179f, 11.5f, 15.25f, 11.8358f, 15.25f, 12.25f)
            curveTo(15.25f, 12.6642f, 15.4179f, 13f, 15.625f, 13f)
            curveTo(15.8321f, 13f, 16f, 12.6642f, 16f, 12.25f)
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
            moveTo(2f, 12f)
            curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
            curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
            close()
        }
        }.build()

        return _lookBottom!!
    }

private var _lookBottom: ImageVector? = null
