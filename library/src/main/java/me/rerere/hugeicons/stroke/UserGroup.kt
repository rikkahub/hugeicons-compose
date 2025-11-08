package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserGroup: ImageVector
    get() {
        if (_userGroup != null) {
            return _userGroup!!
        }
        _userGroup = ImageVector.Builder(
            name = "UserGroup",
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
        moveTo(15.5f, 11f)
        curveTo(15.5f, 9.067f, 13.933f, 7.5f, 12f, 7.5f)
        curveTo(10.067f, 7.5f, 8.5f, 9.067f, 8.5f, 11f)
        curveTo(8.5f, 12.933f, 10.067f, 14.5f, 12f, 14.5f)
        curveTo(13.933f, 14.5f, 15.5f, 12.933f, 15.5f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.4827f, 11.3499f)
        curveTo(15.8047f, 11.4475f, 16.1462f, 11.5f, 16.5f, 11.5f)
        curveTo(18.433f, 11.5f, 20f, 9.933f, 20f, 8f)
        curveTo(20f, 6.067f, 18.433f, 4.5f, 16.5f, 4.5f)
        curveTo(14.6851f, 4.5f, 13.1928f, 5.8814f, 13.0173f, 7.65013f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9827f, 7.65013f)
        curveTo(10.8072f, 5.8814f, 9.31492f, 4.5f, 7.5f, 4.5f)
        curveTo(5.567f, 4.5f, 4f, 6.067f, 4f, 8f)
        curveTo(4f, 9.933f, 5.567f, 11.5f, 7.5f, 11.5f)
        curveTo(7.85381f, 11.5f, 8.19535f, 11.4475f, 8.51727f, 11.3499f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 16.5f)
        curveTo(22f, 13.7386f, 19.5376f, 11.5f, 16.5f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 19.5f)
        curveTo(17.5f, 16.7386f, 15.0376f, 14.5f, 12f, 14.5f)
        curveTo(8.96243f, 14.5f, 6.5f, 16.7386f, 6.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 11.5f)
        curveTo(4.46243f, 11.5f, 2f, 13.7386f, 2f, 16.5f)
        }
        }.build()

        return _userGroup!!
    }

private var _userGroup: ImageVector? = null
