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

val HugeIcons.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = ImageVector.Builder(
            name = "Users",
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
            moveTo(16.5f, 20f)
            verticalLineTo(16.9852f)
            curveTo(16.5f, 16.364f, 16.2184f, 15.7658f, 15.6838f, 15.4494f)
            curveTo(14.1574f, 14.546f, 12.1714f, 14f, 10f, 14f)
            curveTo(7.82863f, 14f, 5.84261f, 14.546f, 4.31618f, 15.4494f)
            curveTo(3.78162f, 15.7658f, 3.5f, 16.364f, 3.5f, 16.9852f)
            verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.5f, 7.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 6.5f, 7.5f)
            arcTo(3.5f, 3.5f, 0f, true, false, 13.5f, 7.5f)
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
            moveTo(20.5f, 20.001f)
            verticalLineTo(16.9862f)
            curveTo(20.5f, 16.365f, 20.2184f, 15.7667f, 19.6838f, 15.4504f)
            curveTo(19.171f, 15.1468f, 18.6062f, 14.8837f, 18f, 14.668f)
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
            moveTo(15f, 4.14453f)
            curveTo(16.4457f, 4.57481f, 17.5f, 5.91408f, 17.5f, 7.49959f)
            curveTo(17.5f, 9.0851f, 16.4457f, 10.4244f, 15f, 10.8547f)
        }
        }.build()

        return _users!!
    }

private var _users: ImageVector? = null
