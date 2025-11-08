package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FirePit: ImageVector
    get() {
        if (_firePit != null) {
            return _firePit!!
        }
        _firePit = ImageVector.Builder(
            name = "FirePit",
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
        moveTo(9.10448f, 17.5f)
        curveTo(8.33359f, 16.5723f, 8.42384f, 15.1986f, 8.69771f, 14.3155f)
        curveTo(13.1751f, 16.5f, 13.7595f, 12.5f, 13.4229f, 11.5f)
        curveTo(14.9282f, 12.5f, 16.3877f, 15.9189f, 14.8371f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.81631f, 17.5f)
        curveTo(5.5924f, 16.4286f, 4.76862f, 11.5478f, 6.12929f, 8.92857f)
        curveTo(7.12501f, 11.0714f, 8.75001f, 11.0714f, 8.75001f, 11.0714f)
        curveTo(7.66668f, 6.78571f, 9.83335f, 3.57143f, 14.0108f, 2.5f)
        curveTo(13.1918f, 4.001f, 12.5366f, 6.34631f, 14.197f, 7.84902f)
        curveTo(14.5485f, 7.18039f, 15.7296f, 5.71429f, 17.4167f, 5.71429f)
        curveTo(17.4167f, 5.71429f, 16.1196f, 8.01619f, 17.5273f, 10.0221f)
        curveTo(19.152f, 12.3372f, 18.736f, 15.7851f, 16.3196f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 17.5f)
        horizontalLineTo(3.5f)
        lineTo(4.1601f, 19.9851f)
        curveTo(4.4949f, 21.2455f, 4.84122f, 21.5f, 6.22165f, 21.5f)
        horizontalLineTo(17.7783f)
        curveTo(19.1588f, 21.5f, 19.5051f, 21.2455f, 19.8399f, 19.9851f)
        lineTo(20.5f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.55556f, 17.5f)
        horizontalLineTo(2.5f)
        moveTo(20.4444f, 17.5f)
        horizontalLineTo(21.5f)
        }
        }.build()

        return _firePit!!
    }

private var _firePit: ImageVector? = null
