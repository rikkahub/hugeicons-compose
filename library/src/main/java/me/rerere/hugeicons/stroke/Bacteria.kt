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

val HugeIcons.Bacteria: ImageVector
    get() {
        if (_bacteria != null) {
            return _bacteria!!
        }
        _bacteria = ImageVector.Builder(
            name = "Bacteria",
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
            moveTo(10f, 12.5f)
            curveTo(9.44772f, 11.8333f, 8.55228f, 11.8333f, 8f, 12.5f)
            curveTo(7.44772f, 13.1667f, 6.55228f, 13.1667f, 6f, 12.5f)
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
            moveTo(15.9142f, 18f)
            curveTo(16.1896f, 17.2971f, 15.7803f, 16.6255f, 15f, 16.5f)
            curveTo(14.2197f, 16.3745f, 13.8104f, 15.7029f, 14.0858f, 15f)
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
            moveTo(17f, 8f)
            arcTo(2f, 2f, 0f, true, false, 13f, 8f)
            arcTo(2f, 2f, 0f, true, false, 17f, 8f)
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
            moveTo(9.125f, 17f)
            horizontalLineTo(9f)
            moveTo(9.25f, 17f)
            curveTo(9.25f, 17.1381f, 9.13807f, 17.25f, 9f, 17.25f)
            curveTo(8.86193f, 17.25f, 8.75f, 17.1381f, 8.75f, 17f)
            curveTo(8.75f, 16.8619f, 8.86193f, 16.75f, 9f, 16.75f)
            curveTo(9.13807f, 16.75f, 9.25f, 16.8619f, 9.25f, 17f)
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
            moveTo(19.125f, 13f)
            horizontalLineTo(19f)
            moveTo(19.25f, 13f)
            curveTo(19.25f, 13.1381f, 19.1381f, 13.25f, 19f, 13.25f)
            curveTo(18.8619f, 13.25f, 18.75f, 13.1381f, 18.75f, 13f)
            curveTo(18.75f, 12.8619f, 18.8619f, 12.75f, 19f, 12.75f)
            curveTo(19.1381f, 12.75f, 19.25f, 12.8619f, 19.25f, 13f)
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
            moveTo(8.125f, 8f)
            horizontalLineTo(8f)
            moveTo(8.25f, 8f)
            curveTo(8.25f, 8.13807f, 8.13807f, 8.25f, 8f, 8.25f)
            curveTo(7.86193f, 8.25f, 7.75f, 8.13807f, 7.75f, 8f)
            curveTo(7.75f, 7.86193f, 7.86193f, 7.75f, 8f, 7.75f)
            curveTo(8.13807f, 7.75f, 8.25f, 7.86193f, 8.25f, 8f)
            close()
        }
        }.build()

        return _bacteria!!
    }

private var _bacteria: ImageVector? = null
