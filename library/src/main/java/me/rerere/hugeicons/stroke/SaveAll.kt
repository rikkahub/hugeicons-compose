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

val HugeIcons.SaveAll: ImageVector
    get() {
        if (_saveAll != null) {
            return _saveAll!!
        }
        _saveAll = ImageVector.Builder(
            name = "SaveAll",
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
            moveTo(16.8787f, 2f)
            horizontalLineTo(12f)
            curveTo(9.17157f, 2f, 7.75736f, 2f, 6.87868f, 2.87868f)
            curveTo(6f, 3.75736f, 6f, 5.17157f, 6f, 8f)
            verticalLineTo(12f)
            curveTo(6f, 14.8284f, 6f, 16.2426f, 6.87868f, 17.1213f)
            curveTo(7.75736f, 18f, 9.17157f, 18f, 12f, 18f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 18f, 20.2426f, 18f, 21.1213f, 17.1213f)
            curveTo(22f, 16.2426f, 22f, 14.8284f, 22f, 12f)
            verticalLineTo(7.12132f)
            curveTo(22f, 6.25606f, 22f, 5.82342f, 21.8851f, 5.42026f)
            curveTo(21.822f, 5.19879f, 21.7335f, 4.98533f, 21.6216f, 4.78409f)
            curveTo(21.4178f, 4.41775f, 21.1118f, 4.11183f, 20.5f, 3.5f)
            curveTo(19.8882f, 2.88817f, 19.5822f, 2.58225f, 19.2159f, 2.37843f)
            curveTo(19.0147f, 2.26647f, 18.8012f, 2.17805f, 18.5797f, 2.11492f)
            curveTo(18.1766f, 2f, 17.7439f, 2f, 16.8787f, 2f)
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
            moveTo(2f, 6f)
            verticalLineTo(12.0002f)
            curveTo(2f, 16.7143f, 2f, 19.0713f, 3.46447f, 20.5357f)
            curveTo(4.92893f, 22.0002f, 7.28597f, 22.0002f, 12f, 22.0002f)
            lineTo(18f, 22.0002f)
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
            moveTo(10f, 2f)
            curveTo(10f, 3.88562f, 10f, 4.82843f, 10.5858f, 5.41421f)
            curveTo(11.1716f, 6f, 12.1144f, 6f, 14f, 6f)
            curveTo(15.8856f, 6f, 16.8284f, 6f, 17.4142f, 5.41421f)
            curveTo(18f, 4.82843f, 18f, 3.88562f, 18f, 2f)
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
            moveTo(18f, 18f)
            verticalLineTo(15f)
            curveTo(18f, 13.1144f, 18f, 12.1716f, 17.4142f, 11.5858f)
            curveTo(16.8284f, 11f, 15.8856f, 11f, 14f, 11f)
            curveTo(12.1144f, 11f, 11.1716f, 11f, 10.5858f, 11.5858f)
            curveTo(10f, 12.1716f, 10f, 13.1144f, 10f, 15f)
            verticalLineTo(18f)
        }
        }.build()

        return _saveAll!!
    }

private var _saveAll: ImageVector? = null
