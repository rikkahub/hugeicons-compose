package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Watermelon: ImageVector
    get() {
        if (_watermelon != null) {
            return _watermelon!!
        }
        _watermelon = ImageVector.Builder(
            name = "Watermelon",
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
        moveTo(15.8868f, 4.07654f)
        curveTo(17.1488f, 5.55202f, 17.9211f, 7.53337f, 17.9211f, 9.71174f)
        curveTo(17.9211f, 14.272f, 14.5364f, 17.9688f, 10.3612f, 17.9688f)
        curveTo(8.04167f, 17.9688f, 6.03867f, 16.9089f, 4.67822f, 15.2242f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.4175f, 3.57276f)
        lineTo(13.3562f, 6.41533f)
        curveTo(13.2666f, 6.49855f, 13.2726f, 6.64182f, 13.3537f, 6.73342f)
        curveTo(14.0308f, 7.49886f, 14.048f, 9.14294f, 13.2715f, 10.1706f)
        curveTo(12.4455f, 11.2636f, 11.2161f, 11.1153f, 10.774f, 10.8878f)
        lineTo(10.5235f, 11.5915f)
        curveTo(10.4287f, 11.8578f, 10.1611f, 12.0219f, 9.88068f, 11.9858f)
        lineTo(8.23877f, 11.7744f)
        curveTo(8.11395f, 11.7583f, 7.98884f, 11.8018f, 7.90094f, 11.8918f)
        lineTo(4.97952f, 14.8835f)
        lineTo(3.58065f, 16.3786f)
        curveTo(2.72253f, 17.2958f, 2.8051f, 18.7534f, 3.9034f, 19.3631f)
        curveTo(7.37659f, 21.2913f, 12.9566f, 22.3318f, 17.8425f, 17.7359f)
        curveTo(22.3576f, 13.0699f, 21.2088f, 7.40772f, 19.431f, 3.95709f)
        curveTo(18.844f, 2.81784f, 17.3568f, 2.70057f, 16.4175f, 3.57276f)
        }
        }.build()

        return _watermelon!!
    }

private var _watermelon: ImageVector? = null
