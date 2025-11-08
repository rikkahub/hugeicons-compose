package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Monster: ImageVector
    get() {
        if (_monster != null) {
            return _monster!!
        }
        _monster = ImageVector.Builder(
            name = "Monster",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11.5f)
        horizontalLineTo(12.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 11.5f)
        curveTo(16.5f, 13.433f, 14.4853f, 15f, 12f, 15f)
        curveTo(9.51472f, 15f, 7.5f, 13.433f, 7.5f, 11.5f)
        curveTo(7.5f, 9.567f, 9.51472f, 8f, 12f, 8f)
        curveTo(14.4853f, 8f, 16.5f, 9.567f, 16.5f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 18f)
        curveTo(13.4846f, 18.3093f, 12.7787f, 18.5f, 12f, 18.5f)
        curveTo(11.2213f, 18.5f, 10.5154f, 18.3093f, 10f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4f)
        curveTo(7.30558f, 4f, 3.5f, 7.80558f, 3.5f, 12.5f)
        curveTo(3.5f, 14.5752f, 4.24365f, 16.4767f, 5.47899f, 17.9525f)
        curveTo(6.06977f, 18.6583f, 6.5f, 19.5115f, 6.5f, 20.4319f)
        curveTo(6.5f, 21.2979f, 7.20207f, 22f, 8.06812f, 22f)
        horizontalLineTo(15.9319f)
        curveTo(16.7979f, 22f, 17.5f, 21.2979f, 17.5f, 20.4319f)
        curveTo(17.5f, 19.5115f, 17.9302f, 18.6583f, 18.521f, 17.9525f)
        curveTo(19.7564f, 16.4767f, 20.5f, 14.5752f, 20.5f, 12.5f)
        curveTo(20.5f, 7.80558f, 16.6944f, 4f, 12f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 5f)
        curveTo(16.1667f, 4.1f, 17f, 2.24f, 19f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 5f)
        curveTo(7.83333f, 4.1f, 7f, 2.24f, 5f, 2f)
        }
        }.build()

        return _monster!!
    }

private var _monster: ImageVector? = null
