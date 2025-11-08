package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChinaTemple: ImageVector
    get() {
        if (_chinaTemple != null) {
            return _chinaTemple!!
        }
        _chinaTemple = ImageVector.Builder(
            name = "ChinaTemple",
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
        moveTo(22f, 12f)
        curveTo(19.6f, 12f, 17.6667f, 10.6667f, 17f, 10f)
        horizontalLineTo(7f)
        curveTo(6.33333f, 10.6667f, 4.4f, 12f, 2f, 12f)
        lineTo(2.17082f, 12.3416f)
        curveTo(2.679f, 13.358f, 3.71779f, 14f, 4.8541f, 14f)
        horizontalLineTo(19.1459f)
        curveTo(20.2822f, 14f, 21.321f, 13.358f, 21.8292f, 12.3416f)
        lineTo(22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 4f)
        curveTo(17.547f, 4f, 16.265f, 3.51128f, 15.3316f, 2.97766f)
        curveTo(14.3479f, 2.41529f, 13.8561f, 2.13411f, 13.6037f, 2.06705f)
        curveTo(13.3513f, 2f, 13.0153f, 2f, 12.3431f, 2f)
        horizontalLineTo(11.6569f)
        curveTo(10.9847f, 2f, 10.6487f, 2f, 10.3963f, 2.06705f)
        curveTo(10.1439f, 2.13411f, 9.65207f, 2.41529f, 8.66839f, 2.97766f)
        curveTo(7.735f, 3.51128f, 6.45303f, 4f, 5f, 4f)
        lineTo(5.17082f, 4.34164f)
        curveTo(5.679f, 5.35799f, 6.71779f, 6f, 7.8541f, 6f)
        horizontalLineTo(16.1459f)
        curveTo(17.2822f, 6f, 18.321f, 5.35799f, 18.8292f, 4.34164f)
        lineTo(19f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 10f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 10f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 22f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 22f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 22f)
        verticalLineTo(19f)
        curveTo(10f, 17.8954f, 10.8954f, 17f, 12f, 17f)
        curveTo(13.1046f, 17f, 14f, 17.8954f, 14f, 19f)
        verticalLineTo(22f)
        }
        }.build()

        return _chinaTemple!!
    }

private var _chinaTemple: ImageVector? = null
