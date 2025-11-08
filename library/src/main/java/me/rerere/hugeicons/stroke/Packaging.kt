package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Packaging: ImageVector
    get() {
        if (_packaging != null) {
            return _packaging!!
        }
        _packaging = ImageVector.Builder(
            name = "Packaging",
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
        moveTo(17.5f, 22f)
        curveTo(17.5f, 22f, 17f, 20f, 17f, 17f)
        curveTo(17f, 11.4f, 18.3333f, 4.66667f, 19f, 2f)
        curveTo(19.6667f, 5f, 21f, 12f, 21f, 16f)
        curveTo(21f, 17.2201f, 20.8139f, 18.6264f, 20.6688f, 19.5375f)
        curveTo(20.5717f, 20.147f, 20.1771f, 20.6614f, 19.6251f, 20.9375f)
        lineTo(17.5f, 22f)
        moveTo(17.5f, 22f)
        horizontalLineTo(5.06155f)
        curveTo(4.14382f, 22f, 3.35065f, 21.3726f, 3.22748f, 20.4631f)
        curveTo(3.11042f, 19.5988f, 3f, 18.4098f, 3f, 17f)
        curveTo(3f, 11f, 5f, 5f, 5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.78077f, 2f)
        horizontalLineTo(19f)
        curveTo(18.9041f, 2.38357f, 18.7944f, 2.85129f, 18.6769f, 3.38767f)
        curveTo(18.4722f, 4.32192f, 17.6532f, 5f, 16.6967f, 5f)
        horizontalLineTo(4.34317f)
        curveTo(4.51028f, 4.14637f, 4.67313f, 3.38764f, 4.8181f, 2.75918f)
        curveTo(4.92124f, 2.31206f, 5.3219f, 2f, 5.78077f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.02139f, 18.0739f)
        curveTo(6.00778f, 17.7328f, 6f, 17.3742f, 6f, 17f)
        curveTo(6f, 15.3484f, 6.11597f, 13.5983f, 6.29662f, 11.8829f)
        curveTo(6.34969f, 11.379f, 6.77722f, 11f, 7.28398f, 11f)
        horizontalLineTo(13.27f)
        curveTo(13.8689f, 11f, 14.3328f, 11.5229f, 14.2722f, 12.1187f)
        curveTo(14.1056f, 13.7583f, 14f, 15.424f, 14f, 17f)
        curveTo(14f, 17.3197f, 14.0057f, 17.628f, 14.0158f, 17.9238f)
        curveTo(14.0358f, 18.5052f, 13.5784f, 19f, 12.9966f, 19f)
        horizontalLineTo(7.00227f)
        curveTo(6.47904f, 19f, 6.04226f, 18.5967f, 6.02139f, 18.0739f)
        }
        }.build()

        return _packaging!!
    }

private var _packaging: ImageVector? = null
