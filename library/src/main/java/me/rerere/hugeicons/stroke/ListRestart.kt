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

val HugeIcons.ListRestart: ImageVector
    get() {
        if (_listRestart != null) {
            return _listRestart!!
        }
        _listRestart = ImageVector.Builder(
            name = "ListRestart",
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
            moveTo(3f, 4.5f)
            horizontalLineTo(21f)
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
            moveTo(3f, 11.5f)
            horizontalLineTo(8f)
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
            moveTo(3f, 18.5f)
            horizontalLineTo(8f)
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
            moveTo(12.7578f, 17.5f)
            curveTo(13.565f, 18.706f, 14.9398f, 19.5f, 16.5f, 19.5f)
            curveTo(18.9853f, 19.5f, 21f, 17.4853f, 21f, 15f)
            curveTo(21f, 12.5147f, 18.9853f, 10.5f, 16.5f, 10.5f)
            curveTo(14.8075f, 10.5f, 13.3332f, 11.4344f, 12.5649f, 12.8154f)
            moveTo(12f, 9.5f)
            verticalLineTo(10.5f)
            curveTo(12f, 11.9142f, 12f, 12.6213f, 12.4393f, 13.0607f)
            curveTo(12.8787f, 13.5f, 13.5858f, 13.5f, 15f, 13.5f)
            horizontalLineTo(16f)
        }
        }.build()

        return _listRestart!!
    }

private var _listRestart: ImageVector? = null
