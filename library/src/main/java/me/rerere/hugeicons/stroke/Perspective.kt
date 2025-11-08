package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = ImageVector.Builder(
            name = "Perspective",
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
        moveTo(4.5f, 11.9999f)
        curveTo(4.5f, 9.51223f, 4.5f, 8.2684f, 5.17206f, 7.38465f)
        curveTo(5.24545f, 7.28814f, 5.32409f, 7.19589f, 5.40762f, 7.10833f)
        curveTo(6.17248f, 6.30646f, 7.38276f, 6.13056f, 9.8033f, 5.77875f)
        lineTo(12.1623f, 5.43589f)
        curveTo(15.5764f, 4.93968f, 17.2834f, 4.69157f, 18.3917f, 5.6695f)
        curveTo(19.5f, 6.64743f, 19.5f, 8.4018f, 19.5f, 11.9106f)
        verticalLineTo(12.0892f)
        curveTo(19.5f, 15.598f, 19.5f, 17.3523f, 18.3917f, 18.3303f)
        curveTo(17.2834f, 19.3082f, 15.5764f, 19.0601f, 12.1623f, 18.5639f)
        lineTo(9.80329f, 18.221f)
        curveTo(7.38275f, 17.8692f, 6.17248f, 17.6933f, 5.40762f, 16.8914f)
        curveTo(5.32409f, 16.8039f, 5.24545f, 16.7116f, 5.17206f, 16.6151f)
        curveTo(4.5f, 15.7314f, 4.5f, 14.4875f, 4.5f, 11.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        lineTo(12f, 2f)
        moveTo(2f, 12f)
        horizontalLineTo(22f)
        }
        }.build()

        return _perspective!!
    }

private var _perspective: ImageVector? = null
