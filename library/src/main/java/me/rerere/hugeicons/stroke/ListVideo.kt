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

val HugeIcons.ListVideo: ImageVector
    get() {
        if (_listVideo != null) {
            return _listVideo!!
        }
        _listVideo = ImageVector.Builder(
            name = "ListVideo",
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
            moveTo(3f, 5f)
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
            moveTo(3f, 12f)
            horizontalLineTo(9f)
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
            moveTo(20.9453f, 15.4512f)
            curveTo(20.7686f, 16.1675f, 19.9333f, 16.6736f, 18.2629f, 17.6859f)
            curveTo(16.648f, 18.6645f, 15.8406f, 19.1538f, 15.1899f, 18.9571f)
            curveTo(14.9209f, 18.8758f, 14.6758f, 18.7214f, 14.4781f, 18.5086f)
            curveTo(14f, 17.9941f, 14f, 16.9961f, 14f, 15f)
            curveTo(14f, 13.0039f, 14f, 12.0059f, 14.4781f, 11.4914f)
            curveTo(14.6758f, 11.2786f, 14.9209f, 11.1242f, 15.1899f, 11.0429f)
            curveTo(15.8406f, 10.8462f, 16.648f, 11.3355f, 18.2629f, 12.3141f)
            curveTo(19.9333f, 13.3264f, 20.7686f, 13.8325f, 20.9453f, 14.5488f)
            curveTo(21.0182f, 14.8445f, 21.0182f, 15.1555f, 20.9453f, 15.4512f)
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
            moveTo(3f, 19f)
            horizontalLineTo(9f)
        }
        }.build()

        return _listVideo!!
    }

private var _listVideo: ImageVector? = null
