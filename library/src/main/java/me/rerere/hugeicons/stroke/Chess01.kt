package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chess01: ImageVector
    get() {
        if (_chess01 != null) {
            return _chess01!!
        }
        _chess01 = ImageVector.Builder(
            name = "Chess01",
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
        moveTo(16.9909f, 22f)
        horizontalLineTo(7.00911f)
        curveTo(5.74413f, 22f, 5.84958f, 20.2425f, 6.34622f, 19.4962f)
        curveTo(7.19456f, 18.2213f, 8.83234f, 16.6274f, 9.07261f, 15.0628f)
        lineTo(10.0036f, 9f)
        horizontalLineTo(13.9964f)
        lineTo(14.9274f, 15.0628f)
        curveTo(15.1677f, 16.6274f, 16.8054f, 18.2213f, 17.6538f, 19.4962f)
        curveTo(18.1504f, 20.2425f, 18.2559f, 22f, 16.9909f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 5.1513f)
        verticalLineTo(2.20709f)
        curveTo(7.5f, 2.03185f, 7.69777f, 1.93612f, 7.82804f, 2.0483f)
        lineTo(10.2219f, 4.1099f)
        curveTo(10.4016f, 4.26468f, 10.6281f, 4.34944f, 10.8621f, 4.34944f)
        horizontalLineTo(13.1379f)
        curveTo(13.3719f, 4.34944f, 13.5984f, 4.26468f, 13.7781f, 4.1099f)
        lineTo(16.172f, 2.0483f)
        curveTo(16.3022f, 1.93612f, 16.5f, 2.03185f, 16.5f, 2.20709f)
        verticalLineTo(5.1513f)
        curveTo(16.5f, 5.63483f, 16.336f, 6.10305f, 16.0364f, 6.4745f)
        lineTo(14.2998f, 8.62815f)
        curveTo(14.1099f, 8.86377f, 13.8284f, 9f, 13.5316f, 9f)
        horizontalLineTo(10.4684f)
        curveTo(10.1716f, 9f, 9.89015f, 8.86377f, 9.70015f, 8.62815f)
        lineTo(7.96356f, 6.47451f)
        curveTo(7.66403f, 6.10305f, 7.5f, 5.63483f, 7.5f, 5.1513f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 18f)
        horizontalLineTo(18f)
        }
        }.build()

        return _chess01!!
    }

private var _chess01: ImageVector? = null
