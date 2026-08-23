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

val HugeIcons.Rocket02: ImageVector
    get() {
        if (_rocket02 != null) {
            return _rocket02!!
        }
        _rocket02 = ImageVector.Builder(
            name = "Rocket02",
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
            moveTo(12f, 9f)
            verticalLineTo(6f)
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
            moveTo(8.5f, 15.4736f)
            horizontalLineTo(15.5f)
            moveTo(8.5f, 15.4736f)
            lineTo(6.66384f, 16.7848f)
            curveTo(6.26237f, 17.1167f, 5.67767f, 17.0727f, 5.46234f, 16.5962f)
            curveTo(4.73447f, 14.9855f, 4.53071f, 11.8868f, 7.42582f, 10.5364f)
            moveTo(8.5f, 15.4736f)
            curveTo(7.88981f, 13.6532f, 7.52235f, 11.9545f, 7.42582f, 10.5364f)
            moveTo(15.5f, 15.4736f)
            lineTo(17.3378f, 16.7848f)
            curveTo(17.7392f, 17.1167f, 18.3239f, 17.0728f, 18.5391f, 16.5963f)
            curveTo(19.2665f, 14.9856f, 19.4677f, 11.8868f, 16.5666f, 10.5364f)
            moveTo(7.42582f, 10.5364f)
            curveTo(7.16746f, 6.17174f, 9.05309f, 3.23691f, 10.7871f, 1.91037f)
            curveTo(11.5084f, 1.35858f, 12.4919f, 1.36399f, 13.2085f, 1.92212f)
            curveTo(14.9207f, 3.25581f, 16.7377f, 6.16394f, 16.5666f, 10.5364f)
            curveTo(16.5102f, 11.9795f, 16.0859f, 13.6174f, 15.5f, 15.4736f)
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
            moveTo(13.5f, 18.5f)
            verticalLineTo(21f)
            moveTo(10.5f, 18.5f)
            verticalLineTo(22.5f)
        }
        }.build()

        return _rocket02!!
    }

private var _rocket02: ImageVector? = null
