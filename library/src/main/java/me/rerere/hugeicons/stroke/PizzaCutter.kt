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

val HugeIcons.PizzaCutter: ImageVector
    get() {
        if (_pizzaCutter != null) {
            return _pizzaCutter!!
        }
        _pizzaCutter = ImageVector.Builder(
            name = "PizzaCutter",
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
            moveTo(11.5355f, 19.5355f)
            curveTo(9.58291f, 21.4882f, 6.41709f, 21.4882f, 4.46447f, 19.5355f)
            curveTo(2.51184f, 17.5829f, 2.51184f, 14.4171f, 4.46447f, 12.4645f)
            curveTo(6.41709f, 10.5118f, 9.58291f, 10.5118f, 11.5355f, 12.4645f)
            curveTo(13.4882f, 14.4171f, 13.4882f, 17.5829f, 11.5355f, 19.5355f)
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
            moveTo(16.1367f, 13.375f)
            curveTo(15.7025f, 12.1438f, 14.9931f, 10.9881f, 14.0083f, 10.0034f)
            curveTo(13.0236f, 9.01865f, 11.8679f, 8.3092f, 10.6367f, 7.875f)
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
            moveTo(15.5f, 11.5f)
            lineTo(20.3787f, 6.62132f)
            curveTo(20.7765f, 6.2235f, 21f, 5.68393f, 21f, 5.12132f)
            curveTo(21f, 3.94975f, 20.0503f, 3f, 18.8787f, 3f)
            curveTo(18.3161f, 3f, 17.7765f, 3.2235f, 17.3787f, 3.62132f)
            lineTo(12.5f, 8.5f)
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
            moveTo(16f, 5f)
            lineTo(19f, 8f)
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
            moveTo(14f, 10f)
            lineTo(12f, 12f)
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
            moveTo(8.125f, 16f)
            horizontalLineTo(8f)
            moveTo(8.25f, 16f)
            curveTo(8.25f, 16.1381f, 8.13807f, 16.25f, 8f, 16.25f)
            curveTo(7.86193f, 16.25f, 7.75f, 16.1381f, 7.75f, 16f)
            curveTo(7.75f, 15.8619f, 7.86193f, 15.75f, 8f, 15.75f)
            curveTo(8.13807f, 15.75f, 8.25f, 15.8619f, 8.25f, 16f)
            close()
        }
        }.build()

        return _pizzaCutter!!
    }

private var _pizzaCutter: ImageVector? = null
