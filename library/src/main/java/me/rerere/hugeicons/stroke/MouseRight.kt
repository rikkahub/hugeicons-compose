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

val HugeIcons.MouseRight: ImageVector
    get() {
        if (_mouseRight != null) {
            return _mouseRight!!
        }
        _mouseRight = ImageVector.Builder(
            name = "MouseRight",
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
            moveTo(11.2422f, 8.5f)
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
            moveTo(12.2422f, 2.0449f)
            curveTo(11.9236f, 2.0152f, 11.5905f, 2f, 11.2422f, 2f)
            curveTo(5.24219f, 2f, 3.74219f, 6.50998f, 3.74219f, 12f)
            curveTo(3.74219f, 17.49f, 5.24219f, 22f, 11.2422f, 22f)
            curveTo(17.2423f, 22f, 18.7422f, 17.49f, 18.7422f, 12f)
            curveTo(18.7422f, 11.3158f, 18.7189f, 10.6469f, 18.6665f, 10f)
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
            moveTo(16.2422f, 4f)
            curveTo(16.2422f, 5.10457f, 17.1376f, 6f, 18.2422f, 6f)
            curveTo(19.3468f, 6f, 20.2422f, 5.10457f, 20.2422f, 4f)
            curveTo(20.2422f, 2.89543f, 19.3468f, 2f, 18.2422f, 2f)
            curveTo(17.1376f, 2f, 16.2422f, 2.89543f, 16.2422f, 4f)
            close()
        }
        }.build()

        return _mouseRight!!
    }

private var _mouseRight: ImageVector? = null
