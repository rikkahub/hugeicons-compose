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

val HugeIcons.MouseLeft: ImageVector
    get() {
        if (_mouseLeft != null) {
            return _mouseLeft!!
        }
        _mouseLeft = ImageVector.Builder(
            name = "MouseLeft",
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
            moveTo(12.7422f, 8.5f)
            verticalLineTo(5.5f)
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
            moveTo(11.7422f, 2.0449f)
            curveTo(12.0607f, 2.0152f, 12.3939f, 2f, 12.7422f, 2f)
            curveTo(18.7422f, 2f, 20.2422f, 6.50998f, 20.2422f, 12f)
            curveTo(20.2422f, 17.49f, 18.7422f, 22f, 12.7422f, 22f)
            curveTo(6.74212f, 22f, 5.24219f, 17.49f, 5.24219f, 12f)
            curveTo(5.24219f, 11.3158f, 5.26548f, 10.6469f, 5.31788f, 10f)
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
            moveTo(7.74219f, 4f)
            arcTo(2f, 2f, 0f, true, false, 3.74219f, 4f)
            arcTo(2f, 2f, 0f, true, false, 7.74219f, 4f)
            close()
        }
        }.build()

        return _mouseLeft!!
    }

private var _mouseLeft: ImageVector? = null
