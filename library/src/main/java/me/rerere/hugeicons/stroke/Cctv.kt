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

val HugeIcons.Cctv: ImageVector
    get() {
        if (_cctv != null) {
            return _cctv!!
        }
        _cctv = ImageVector.Builder(
            name = "Cctv",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 6f)
            curveTo(2f, 4.89543f, 2.89543f, 4f, 4f, 4f)
            horizontalLineTo(20f)
            curveTo(21.1046f, 4f, 22f, 4.89543f, 22f, 6f)
            curveTo(22f, 7.10457f, 21.1046f, 8f, 20f, 8f)
            horizontalLineTo(4f)
            curveTo(2.89543f, 8f, 2f, 7.10457f, 2f, 6f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20f, 8f)
            verticalLineTo(12f)
            curveTo(20f, 16.4183f, 16.4183f, 20f, 12f, 20f)
            curveTo(7.58172f, 20f, 4f, 16.4183f, 4f, 12f)
            verticalLineTo(8f)
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
            moveTo(15f, 14f)
            curveTo(15f, 15.6569f, 13.6569f, 17f, 12f, 17f)
            curveTo(10.3431f, 17f, 9f, 15.6569f, 9f, 14f)
            curveTo(9f, 12.3431f, 10.3431f, 11f, 12f, 11f)
            curveTo(13.6569f, 11f, 15f, 12.3431f, 15f, 14f)
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
            moveTo(12f, 13.875f)
            verticalLineTo(14f)
            moveTo(12.25f, 14f)
            curveTo(12.25f, 14.1381f, 12.1381f, 14.25f, 12f, 14.25f)
            curveTo(11.8619f, 14.25f, 11.75f, 14.1381f, 11.75f, 14f)
            curveTo(11.75f, 13.8619f, 11.8619f, 13.75f, 12f, 13.75f)
            curveTo(12.1381f, 13.75f, 12.25f, 13.8619f, 12.25f, 14f)
            close()
        }
        }.build()

        return _cctv!!
    }

private var _cctv: ImageVector? = null
