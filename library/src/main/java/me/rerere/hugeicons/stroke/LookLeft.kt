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

val HugeIcons.LookLeft: ImageVector
    get() {
        if (_lookLeft != null) {
            return _lookLeft!!
        }
        _lookLeft = ImageVector.Builder(
            name = "LookLeft",
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
            moveTo(9f, 14f)
            curveTo(8.08779f, 14.6072f, 6.63545f, 15f, 4.99963f, 15f)
            curveTo(3.87389f, 15f, 3.3355f, 14.8139f, 2.5f, 14.5f)
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
            moveTo(7.625f, 8.387f)
            verticalLineTo(8.91649f)
            moveTo(7.25f, 8.75f)
            curveTo(7.25f, 8.33579f, 7.41789f, 8f, 7.625f, 8f)
            curveTo(7.83211f, 8f, 8f, 8.33579f, 8f, 8.75f)
            curveTo(8f, 9.16421f, 7.83211f, 9.5f, 7.625f, 9.5f)
            curveTo(7.41789f, 9.5f, 7.25f, 9.16421f, 7.25f, 8.75f)
            close()
        }
        }.build()

        return _lookLeft!!
    }

private var _lookLeft: ImageVector? = null
