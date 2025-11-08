package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextSmallcaps: ImageVector
    get() {
        if (_textSmallcaps != null) {
            return _textSmallcaps!!
        }
        _textSmallcaps = ImageVector.Builder(
            name = "TextSmallcaps",
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
        moveTo(10.5714f, 18f)
        horizontalLineTo(5.42857f)
        moveTo(8f, 3f)
        verticalLineTo(18f)
        moveTo(8f, 3f)
        curveTo(6.81082f, 3f, 5.28326f, 3.12265f, 4.06709f, 3.24346f)
        curveTo(3.55271f, 3.29456f, 3.29552f, 3.32011f, 3.06788f, 3.41021f)
        curveTo(2.59438f, 3.59763f, 2.21271f, 4.00855f, 2.06906f, 4.48556f)
        curveTo(2f, 4.71489f, 2f, 4.97659f, 2f, 5.5f)
        moveTo(8f, 3f)
        curveTo(9.18918f, 3f, 10.7167f, 3.12265f, 11.9329f, 3.24346f)
        curveTo(12.4473f, 3.29456f, 12.7045f, 3.32011f, 12.9321f, 3.41021f)
        curveTo(13.4056f, 3.59763f, 13.7873f, 4.00855f, 13.9309f, 4.48556f)
        curveTo(14f, 4.71489f, 14f, 4.97659f, 14f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.7143f, 21f)
        horizontalLineTo(16.2857f)
        moveTo(18f, 12f)
        verticalLineTo(21f)
        moveTo(18f, 12f)
        curveTo(17.2072f, 12f, 16.1888f, 12.0818f, 15.3781f, 12.1623f)
        curveTo(15.0351f, 12.1964f, 14.8637f, 12.2134f, 14.7119f, 12.2735f)
        curveTo(14.3963f, 12.3984f, 14.1418f, 12.6724f, 14.046f, 12.9904f)
        curveTo(14f, 13.1433f, 14f, 13.3177f, 14f, 13.6667f)
        moveTo(18f, 12f)
        curveTo(18.7928f, 12f, 19.8112f, 12.0818f, 20.6219f, 12.1623f)
        curveTo(20.9649f, 12.1964f, 21.1363f, 12.2134f, 21.2881f, 12.2735f)
        curveTo(21.6037f, 12.3984f, 21.8582f, 12.6724f, 21.954f, 12.9904f)
        curveTo(22f, 13.1433f, 22f, 13.3177f, 22f, 13.6667f)
        }
        }.build()

        return _textSmallcaps!!
    }

private var _textSmallcaps: ImageVector? = null
