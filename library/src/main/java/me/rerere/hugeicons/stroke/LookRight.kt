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

val HugeIcons.LookRight: ImageVector
    get() {
        if (_lookRight != null) {
            return _lookRight!!
        }
        _lookRight = ImageVector.Builder(
            name = "LookRight",
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
            moveTo(22f, 12f)
            arcTo(10f, 10f, 0f, true, false, 2f, 12f)
            arcTo(10f, 10f, 0f, true, false, 22f, 12f)
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
            moveTo(15f, 14f)
            curveTo(15.9122f, 14.6072f, 17.3645f, 15f, 19.0004f, 15f)
            curveTo(20.1261f, 15f, 20.6645f, 14.8139f, 21.5f, 14.5f)
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
            moveTo(16.375f, 8.387f)
            verticalLineTo(8.91649f)
            moveTo(16.75f, 8.75f)
            curveTo(16.75f, 8.33579f, 16.5821f, 8f, 16.375f, 8f)
            curveTo(16.1679f, 8f, 16f, 8.33579f, 16f, 8.75f)
            curveTo(16f, 9.16421f, 16.1679f, 9.5f, 16.375f, 9.5f)
            curveTo(16.5821f, 9.5f, 16.75f, 9.16421f, 16.75f, 8.75f)
            close()
        }
        }.build()

        return _lookRight!!
    }

private var _lookRight: ImageVector? = null
